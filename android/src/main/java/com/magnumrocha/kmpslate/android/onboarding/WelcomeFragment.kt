package com.magnumrocha.kmpslate.android.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.magnumrocha.kmpslate.android.databinding.WelcomeFragmentBinding
import dagger.android.support.DaggerFragment

class WelcomeFragment : DaggerFragment() {

    private lateinit var binding: WelcomeFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = WelcomeFragmentBinding.inflate(inflater, container, false)
        //binding.viewmodel = viewModel
        //binding.lifecycleOwner = viewLifecycleOwner
        //setHasOptionsMenu(true)
        return binding.root
    }

}