package com.alphanication.spacestar_base.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import dagger.android.support.DaggerFragment

typealias Inflate<VB> = (LayoutInflater, ViewGroup?, Boolean) -> VB

abstract class BaseFragment<VM : ViewModel, VB : ViewBinding>(
    private val inflate: Inflate<VB>,
) : DaggerFragment() {

    lateinit var binding: VB
    abstract val factory: ViewModelProvider.Factory
    abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = inflate.invoke(inflater, container, false)
        return binding.root
    }
}