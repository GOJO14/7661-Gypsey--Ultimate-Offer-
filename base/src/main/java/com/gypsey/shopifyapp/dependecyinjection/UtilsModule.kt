package com.gypsey.shopifyapp.dependecyinjection
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.shopify.buy3.GraphClient
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.dbconnection.database.AppDatabase
import com.gypsey.shopifyapp.repositories.Repository
import com.gypsey.shopifyapp.utils.ApiCallInterface
import com.gypsey.shopifyapp.utils.Constant
import com.gypsey.shopifyapp.utils.Urls
import com.gypsey.shopifyapp.utils.ViewModelFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import dagger.Module
import dagger.Provides
import me.jessyan.retrofiturlmanager.RetrofitUrlManager
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI

@Module
class UtilsModule(private val context: Context) {

    internal val requestHeader: OkHttpClient
        @Provides
        @Singleton
        get() {
            val httpClient =  RetrofitUrlManager.getInstance().with( OkHttpClient.Builder())
            httpClient.addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder().build()
                Log.i("MageNative","Request_Data "+request.url())
                Log.i("MageNative","Request_Data "+request.headers())
                Log.i("MageNative","Request_Data "+request.body())
                Log.i("MageNative","Request_Data "+request.method())
                chain.proceed(request)
            }
            .connectTimeout(100, TimeUnit.SECONDS)
            .writeTimeout(100, TimeUnit.SECONDS)
            .readTimeout(300, TimeUnit.SECONDS)

            return httpClient.build()
        }

    @Provides
    @Singleton
    internal fun provideGson(): Gson {
        val builder = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return builder.setLenient().create()
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {


        return Retrofit.Builder()
                .baseUrl(Urls.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }

    @Provides
    @Singleton
    internal fun getApiCallInterface(retrofit: Retrofit): ApiCallInterface {
        return retrofit.create(ApiCallInterface::class.java)
    }

    @Provides
    @Singleton
    internal fun getRepository(apiCallInterface: ApiCallInterface, appDatabase: AppDatabase, client: GraphClient): Repository {
        return Repository(apiCallInterface, appDatabase, client)
    }

    @Provides
    @Singleton
    internal fun getViewModelFactory(myRepository: Repository): ViewModelProvider.Factory {
        return ViewModelFactory(myRepository)
    }

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    internal fun getAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "MageNative").fallbackToDestructiveMigration().allowMainThreadQueries().build()
    }

    @Provides
    @Singleton
    internal fun getGraphClient(context: Context, client: OkHttpClient): GraphClient {

        return GraphClient.build(context, context.resources.getString(R.string.shopdomain), context.resources.getString(R.string.apikey)
        ) {
            httpClient = client
            httpCache(context.cacheDir, {
                cacheMaxSizeBytes = 1024 * 1024 * 10
                defaultCachePolicy = Constant.policy
                Unit
            })
            Unit
        }
    }
}
