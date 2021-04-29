package com.gypsey.shopifyapp.basesection.activities

import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gypsey.shopifyapp.MyApplication
import com.gypsey.shopifyapp.basesection.ItemDecoration.GridSpacingItemDecoration
import com.gypsey.shopifyapp.basesection.fragments.BaseFragment
import com.gypsey.shopifyapp.customviews.MageNativeTextView
import butterknife.BindView
import butterknife.ButterKnife
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.R2
import com.gypsey.shopifyapp.utils.Constant
import java.util.*

open class BaseActivity : AppCompatActivity(), BaseFragment.OnFragmentInteractionListener {

    @BindView(R2.id.toolbar)
    lateinit var toolbar: Toolbar

    @BindView(R2.id.toolimage)
    lateinit var toolimage: ImageView

    @BindView(R2.id.tooltext)
    lateinit var tooltext: MageNativeTextView

    @BindView(R2.id.drawer_layout)
    lateinit var drawer_layout: DrawerLayout

    private var mDrawerToggle: ActionBarDrawerToggle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m_baseactivity)
        ButterKnife.bind(this)
        (application as MyApplication).mageNativeAppComponent!!.doBaseActivityInjection(this)
        setSupportActionBar(toolbar)
        setToggle()
        Objects.requireNonNull<ActionBar>(supportActionBar).setDisplayShowTitleEnabled(false)
        showTittle(resources.getString(R.string.app_name))
        tooltext!!.textSize = 14f
        showHumburger()
        try {

            MyApplication.dataBaseReference.child("additional_info").child("appthemecolor").addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    var value = dataSnapshot.getValue(String::class.java)!!
                    if (!value.contains("#")) {
                        value = "#" + value
                    }
                    toolbar.setBackgroundColor(Color.parseColor(value))
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
    }

    init {
        updateConfig(this)
    }

    fun updateConfig(wrapper: ContextThemeWrapper) {
        var dLocale = Locale(Constant.locale)
        Locale.setDefault(dLocale)
        val configuration = Configuration()
        configuration.setLocale(dLocale)
        wrapper.applyOverrideConfiguration(configuration)
    }

    private fun setToggle() {
        mDrawerToggle = object : ActionBarDrawerToggle(this@BaseActivity, drawer_layout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerOpened(drawerView: View) {
                if (drawerView != null) {
                    super.onDrawerOpened(drawerView)
                }
                invalidateOptionsMenu()
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                invalidateOptionsMenu()
            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                super.onDrawerSlide(drawerView, slideOffset)
            }
        }
        mDrawerToggle!!.syncState()
    }

    protected fun showBackButton() {
        mDrawerToggle!!.isDrawerIndicatorEnabled = false
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mDrawerToggle!!.toolbarNavigationClickListener = View.OnClickListener { onBackPressed() }
        drawer_layout!!.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        mDrawerToggle!!.onDrawerStateChanged(DrawerLayout.STATE_IDLE)
        mDrawerToggle!!.isDrawerIndicatorEnabled = false
        mDrawerToggle!!.syncState()
    }

    fun showHumburger() {
        supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        mDrawerToggle!!.isDrawerIndicatorEnabled = true
        mDrawerToggle!!.toolbarNavigationClickListener = null
    }

    protected fun showTittle(tittle: String) {
        Objects.requireNonNull<MageNativeTextView>(tooltext).visibility = View.VISIBLE
        Objects.requireNonNull<ImageView>(toolimage).visibility = View.GONE
        tooltext!!.text = tittle
    }

    override fun onFragmentInteraction(view: View) {

    }

    fun setLayout(view: RecyclerView, orientation: String): RecyclerView {
        view.setHasFixedSize(true)
        view.isNestedScrollingEnabled = false
        view.itemAnimator = DefaultItemAnimator()
        val manager = LinearLayoutManager(this)
        when (orientation) {
            "horizontal" -> {
                manager.orientation = RecyclerView.HORIZONTAL
                view.layoutManager = manager
                if (view.itemDecorationCount == 0) {
                    view.addItemDecoration(GridSpacingItemDecoration(1, dpToPx(2), true))
                }
            }
            "vertical" -> {
                manager.orientation = RecyclerView.VERTICAL
                view.layoutManager = manager
                if (view.itemDecorationCount == 0) {
                    view.addItemDecoration(GridSpacingItemDecoration(1, dpToPx(2), true))
                }
            }
            "grid" -> {
                view.layoutManager = GridLayoutManager(this, 2)
                if (view.itemDecorationCount == 0) {
                    view.addItemDecoration(GridSpacingItemDecoration(2, dpToPx(2), true))
                }
            }
            "3grid" -> {
                view.layoutManager = GridLayoutManager(this, 3)
                if (view.itemDecorationCount == 0) {
                    view.addItemDecoration(GridSpacingItemDecoration(3, dpToPx(2), true))
                }
            }
        }
        return view
    }

    private fun dpToPx(dp: Int): Int {
        val r = resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }
}
