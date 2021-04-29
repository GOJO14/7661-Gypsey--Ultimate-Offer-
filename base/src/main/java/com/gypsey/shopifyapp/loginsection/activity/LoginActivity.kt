package com.gypsey.shopifyapp.loginsection.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.shopify.buy3.Storefront
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MLoginPageBinding
import com.gypsey.shopifyapp.basesection.activities.BaseActivity
import com.gypsey.shopifyapp.cartsection.activities.CartList
import com.gypsey.shopifyapp.homesection.activities.HomePage
import com.gypsey.shopifyapp.loginsection.viewmodels.LoginViewModel
import com.gypsey.shopifyapp.utils.ViewModelFactory

import javax.inject.Inject

class LoginActivity : BaseActivity() {
    private var binding: MLoginPageBinding? = null
    @Inject
    lateinit var factory: ViewModelFactory
    private var model: LoginViewModel? = null
    private var sheet: BottomSheetBehavior<*>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val group = findViewById<ViewGroup>(R.id.container)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.m_login_page, group, true)
        showBackButton()
        showTittle(resources.getString(R.string.login))
        (application as MyApplication).mageNativeAppComponent!!.doLoginActivtyInjection(this)
        sheet = BottomSheetBehavior.from(binding!!.includedforgot.bottomSheet)
        sheet!!.state = BottomSheetBehavior.STATE_COLLAPSED
        model = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)
        model!!.context=this
        model!!.Response().observe(this, Observer<Storefront.CustomerAccessToken> { this.consumeResponse(it) })
        model!!.getResponsedata_().observe(this, Observer<Storefront.Customer> { this.MapLoginDetails(it) })
        model!!.errormessage.observe(this, Observer<String> { this.showToast(it) })
        var hand= MyClickHandlers(this)
        try {
            MyApplication.dataBaseReference.child("additional_info").child("login").addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val value = dataSnapshot.getValue(String::class.java)!!
                    hand.image=value
                }
                override fun onCancelled(databaseError: DatabaseError) {
                    Log.i("DBConnectionError", "" + databaseError.details)
                    Log.i("DBConnectionError", "" + databaseError.message)
                    Log.i("DBConnectionError", "" + databaseError.code)
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
        binding!!.handlers =hand
    }

    private fun showToast(toast: String) {
        Toast.makeText(this, toast, Toast.LENGTH_LONG).show()
    }

    private fun consumeResponse(result: Storefront.CustomerAccessToken) {
        model!!.savetoken(result)
    }

    private fun MapLoginDetails(customer: Storefront.Customer) {
        model!!.saveUser(customer.id.toString(),customer.firstName, customer.lastName)
        if (intent.getStringExtra("checkout_id") != null) {
            val intent = Intent(this@LoginActivity, CartList::class.java)
            intent.putExtra("checkout_id", getIntent().getStringExtra("checkout_id"))
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        } else {
            val intent = Intent(this@LoginActivity, HomePage::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
        finish()
    }

    inner class MyClickHandlers(private val context: Context):BaseObservable() {
        @get:Bindable
        var image: String? = null
            set(image) {
                field = image
                notifyPropertyChanged(BR.image)
            }
        fun onSignUpClicked(view: View) {
            if (binding!!.includedlogin.username.text!!.toString().isEmpty()) {
                binding!!.includedlogin.username.error = resources.getString(R.string.empty)
                binding!!.includedlogin.username.requestFocus()
            } else {
                if (!model!!.isValidEmail(binding!!.includedlogin.username.text!!.toString())) {
                    binding!!.includedlogin.username.error = resources.getString(R.string.invalidemail)
                    binding!!.includedlogin.username.requestFocus()
                } else {
                    if (binding!!.includedlogin.password.text!!.toString().isEmpty()) {
                        binding!!.includedlogin.password.error = resources.getString(R.string.empty)
                        binding!!.includedlogin.password.requestFocus()
                    } else {
                        model!!.getUser(binding!!.includedlogin.username.text!!.toString(), binding!!.includedlogin.password.text!!.toString())
                    }
                }
            }
        }

        fun newsignup(view: View) {
            val signup_page = Intent(context, RegistrationActivity::class.java)
            startActivity(signup_page)
        }

        fun forgotPass(view: View) {
            if (sheet!!.state == BottomSheetBehavior.STATE_COLLAPSED) {
                sheet!!.state = BottomSheetBehavior.STATE_EXPANDED
            }
            if (sheet!!.state == BottomSheetBehavior.STATE_EXPANDED) {
                sheet!!.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }

        fun forgotPassword(view: View) {
            if (binding!!.includedforgot.email.text!!.toString().isEmpty()) {
                binding!!.includedforgot.email.error = resources.getString(R.string.empty)
                binding!!.includedforgot.email.requestFocus()
            } else {
                if (!model!!.isValidEmail(binding!!.includedforgot.email.text!!.toString())) {
                    binding!!.includedforgot.email.error = resources.getString(R.string.invalidemail)
                    binding!!.includedforgot.email.requestFocus()
                } else {
                    model!!.recoverCustomer(binding!!.includedforgot.email.text!!.toString())
                    sheet!!.state = BottomSheetBehavior.STATE_COLLAPSED
                    binding!!.includedforgot.email.setText(" ")
                }
            }
        }

        fun closeForgotDialog(view: View){
            sheet!!.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}
