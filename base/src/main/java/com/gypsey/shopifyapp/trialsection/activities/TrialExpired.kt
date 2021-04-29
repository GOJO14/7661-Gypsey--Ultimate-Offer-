package com.gypsey.shopifyapp.trialsection.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.R2
import com.gypsey.shopifyapp.basesection.activities.Splash

import butterknife.OnClick
import com.gypsey.shopifyapp.customviews.MageNativeButton
import kotlinx.android.synthetic.main.m_trial.*

class TrialExpired : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m_trial)
        tryagain.setOnClickListener(View.OnClickListener {
            tryAgain()
        })
//        ButterKnife.bind(this)
    }

    protected override fun onResume() {
        super.onResume()
    }


    fun tryAgain() {
        val intent = Intent(this@TrialExpired, Splash::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    public override fun onBackPressed() {
        super.onBackPressed()
    }
}
