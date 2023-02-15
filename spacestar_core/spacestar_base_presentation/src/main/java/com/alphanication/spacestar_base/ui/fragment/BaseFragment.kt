package com.alphanication.spacestar_base.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.alphanication.spacestar_base.ui.view_model.Factory
import com.alphanication.spacestar_base.ui.view_model.ViewModelFactory

typealias Inflate<VB> = (LayoutInflater, ViewGroup?, Boolean) -> VB

abstract class BaseFragment<VM : ViewModel, VB : ViewBinding>(
    private val inflate: Inflate<VB>,
) : Fragment() {

    lateinit var binding: VB
    abstract val factory: ViewModelFactory<VM>
    abstract val viewModel: VM

    fun <VM> assistedViewModel(
    ): Lazy<VM> =
        viewModels(ownerProducer = { this }, factoryProducer = {
            Factory(factory, this, arguments ?: Bundle.EMPTY)
        })

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = inflate.invoke(inflater, container, false)
        return binding.root
    }
}