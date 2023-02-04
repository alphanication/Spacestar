package com.alphanication.spacestar_base.ui.view_model

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

interface ViewModelFactory<T: ViewModel> {
    fun create(savedStateHandle: SavedStateHandle): T
}