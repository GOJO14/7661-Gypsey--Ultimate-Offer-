package com.gypsey.shopifyapp

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.multidex.MultiDexApplication
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import com.gypsey.shopifyapp.dependecyinjection.MageNativeAppComponent
import com.gypsey.shopifyapp.dependecyinjection.DaggerMageNativeAppComponent
import com.gypsey.shopifyapp.dependecyinjection.UtilsModule
import com.gypsey.shopifyapp.utils.Urls
import net.danlew.android.joda.JodaTimeAndroid

class MyApplication : MultiDexApplication() {
    var mageNativeAppComponent: MageNativeAppComponent? = null

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
        context = this
        mageNativeAppComponent = DaggerMageNativeAppComponent.builder().utilsModule(UtilsModule(this)).build()
        val options = FirebaseOptions.Builder()
                .setProjectId("live-shopify-project")
                .setApplicationId("1:322600045606:android:ccd0e8d87b47235fab6ae7") // Required for Analytics.
                .setApiKey("AIzaSyC1LTEUGgrKWBDVRV0VMQJOCN2O-UyVKr4") // Required for Auth.
                .setDatabaseUrl("https://live-shopify-project.firebaseio.com/") // Required for RTDB.
                .build()
        firebaseapp = FirebaseApp.initializeApp(this /* Context */, options, "MageNative")

    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
    }

    companion object {
        lateinit var context: MyApplication
        lateinit var firebaseapp: FirebaseApp
        private var mFirebaseSecondanyInstance: FirebaseDatabase? = null
        var flag: Boolean = false;
        fun getmFirebaseSecondanyInstance(): FirebaseDatabase {
            if (mFirebaseSecondanyInstance == null) {
                val secondary = FirebaseApp.getInstance("MageNative")
                mFirebaseSecondanyInstance = FirebaseDatabase.getInstance(secondary)
            }
            return mFirebaseSecondanyInstance as FirebaseDatabase
        }

        lateinit var dataBaseReference: DatabaseReference
    }
}
