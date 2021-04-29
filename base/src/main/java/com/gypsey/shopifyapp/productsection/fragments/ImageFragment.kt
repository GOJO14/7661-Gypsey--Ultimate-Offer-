package com.gypsey.shopifyapp.productsection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.gypsey.shopifyapp.R
import com.gypsey.shopifyapp.databinding.MImagefragmentBinding
import com.gypsey.shopifyapp.basesection.fragments.BaseFragment
import com.gypsey.shopifyapp.basesection.models.CommanModel

import java.util.Objects

class ImageFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<MImagefragmentBinding>(layoutInflater, R.layout.m_imagefragment, null, false)
        val url = Objects.requireNonNull<Bundle>(arguments).getString("url")
        val model = CommanModel()
        model.imageurl = url!!
        binding.commondata = model
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}