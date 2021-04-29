package com.gypsey.shopifyapp.checkoutsection.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.databinding.ActivityOrderSuccessBinding
import com.gypsey.shopifyapp.homesection.activities.HomePage
import kotlinx.android.synthetic.main.activity_order_success.*

class OrderSuccessActivity : BaseActivity() {
    lateinit var binding: ActivityOrderSuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val content = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_order_success, content, true)
        (application as MyApplication).mageNativeAppComponent!!.orderSuccessInjection(this)
        showTittle(resources.getString(R.string.checkout))
        showBackButton()
        binding.continueShopping.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }
    }
}