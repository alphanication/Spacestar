package com.alphanication.spacestar_base.ui.view_model

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner

class Factory<T : ViewModel>(
    private val factory: ViewModelFactory<T>,
    owner: SavedStateRegistryOwner,
    private val defaultArgs: Bundle
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {

    override fun <T : ViewModel> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {

        return factory.create(handle.withArgs(defaultArgs)) as? T
            ?: throw IllegalStateException("ViewModel class not exists ${modelClass.simpleName}")
    }
}