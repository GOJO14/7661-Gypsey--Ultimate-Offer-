package com.gypsey.shopifyapp.basesection.models
import android.app.Activity
import android.app.Application
import android.graphics.*
import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import androidx.databinding.library.baseAdapters.BR
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.BitmapImageViewTarget
import com.bumptech.glide.request.target.Target
import com.gypsey.shopifyapp.MyApplication.Companion.context
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.homesection.models.CategoryCircle
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
fun <String> ImageView.loadCircularImage(
        model: kotlin.String,
        borderSize: Float = 0F,
        borderColor: Int = Color.TRANSPARENT
) {
    Glide.with(context)
            .asBitmap()
            .load(model)
            .apply(RequestOptions.circleCropTransform())
            .into(object : BitmapImageViewTarget(this) {
                override fun setResource(resource: Bitmap?) {
                    setImageDrawable(
                            resource?.run {
                                RoundedBitmapDrawableFactory.create(
                                        resources,
                                        if (borderSize > 0) {
                                            createBitmapWithBorder(borderSize, borderColor)
                                        } else {
                                            this
                                        }
                                ).apply {
                                    isCircular = true
                                }
                            }
                    )
                }
            })
}
fun Bitmap.createBitmapWithBorder(borderSize: Float, borderColor: Int = Color.WHITE): Bitmap {
    val borderOffset = (borderSize * 2).toInt()
    val halfWidth = width / 2
    val halfHeight = height / 2
    val circleRadius = Math.min(halfWidth, halfHeight).toFloat()
    val newBitmap = Bitmap.createBitmap(
            width + borderOffset,
            height + borderOffset,
            Bitmap.Config.ARGB_8888
    )

    // Center coordinates of the image
    val centerX = halfWidth + borderSize
    val centerY = halfHeight + borderSize

    val paint = Paint()
    val canvas = Canvas(newBitmap).apply {
        // Set transparent initial area
        drawARGB(0, 0, 0, 0)
    }

    // Draw the transparent initial area
    paint.isAntiAlias = true
    paint.style = Paint.Style.FILL
    canvas.drawCircle(centerX, centerY, circleRadius, paint)

    // Draw the image
    paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
    canvas.drawBitmap(this, borderSize, borderSize, paint)

    // Draw the createBitmapWithBorder
    paint.xfermode = null
    paint.style = Paint.Style.STROKE
    paint.color = borderColor
    paint.strokeWidth = borderSize
    canvas.drawCircle(centerX, centerY, circleRadius, paint)
    return newBitmap
}
class CommanModel :BaseObservable(){
    @get:Bindable
    var imageurl: String? = null
        set(imageurl) {
            field = imageurl
            notifyPropertyChanged(BR.imageurl)

        }


    companion object {
        @BindingAdapter("imageUrl")
        @JvmStatic
        fun loadImage(view: ImageView, imageUrl: String?) {

            val observable = Observable.fromCallable { imageUrl }
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<String?> {
                        override fun onSubscribe(d: Disposable) {

                        }

                        override fun onNext(s: String) {
                            Log.i("Magenative ","Developer image url "+s)
                                Glide.with(context)
                                        .asBitmap()
                                        .load(s)
                                        //.thumbnail(0.5f)
                                        // .apply(RequestOptions().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).dontTransform().diskCacheStrategy(DiskCacheStrategy.ALL))
                                        .into(view)

                        }

                        override fun onError(e: Throwable) {

                        }

                        override fun onComplete() {

                        }
                    })
        }
        @BindingAdapter("circleImageUrl")
        @JvmStatic
        fun circleLoadImage(view: ImageView, imageUrl: String?) {
            val observable = Observable.fromCallable { imageUrl }
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<String?> {
                        override fun onSubscribe(d: Disposable) {
                        }
                        override fun onNext(s: String) {
                            view.loadCircularImage<String>(s,2f,Color.parseColor(view.tag.toString()))
                          /*  Glide.with(view.context)
                                    .load(s)
                                    .thumbnail(0.5f)
                                    .apply(RequestOptions.circleCropTransform().placeholder(R.drawable.image_placeholder).error(R.drawable.image_placeholder).diskCacheStrategy(DiskCacheStrategy.ALL))
                                    .into(view)*/
                        }
                        override fun onError(e: Throwable) {
                        }
                        override fun onComplete() {
                        }
                    })
        }

        @BindingAdapter("radius","url")
        @JvmStatic
        fun Image(view: ImageView, radius: String?,url:String?) {

            val observable = Observable.fromCallable { url }
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<String?> {
                        override fun onSubscribe(d: Disposable) {

                        }

                        override fun onNext(s: String) {
                           var round:RequestOptions
                            when(radius){
                                "0"->{
                                    round=RequestOptions().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).dontTransform().diskCacheStrategy(DiskCacheStrategy.ALL)
                                }else->{
                                    round=RequestOptions().placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).transform(RoundedCorners(radius!!.toInt())).diskCacheStrategy(DiskCacheStrategy.ALL)
                                }
                            }
                            Glide.with(view.context)
                                    .load(url)
                                    .thumbnail(0.5f)
                                    .apply(round)
                                    .into(view)

                        }

                        override fun onError(e: Throwable) {

                        }

                        override fun onComplete() {

                        }
                    })
        }
    }


}
