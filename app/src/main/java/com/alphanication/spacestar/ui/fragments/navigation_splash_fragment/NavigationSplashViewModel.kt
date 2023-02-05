package com.alphanication.spacestar.ui.fragments.navigation_splash_fragment

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.alphanication.spacestar_base.ui.view_model.ViewModelFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class NavigationSplashViewModel @AssistedInject constructor(
    @Assisted savedStateHandle: SavedStateHandle
) : ViewModel() {

    @AssistedFactory
    interface Factory : ViewModelFactory<NavigationSplashViewModel>
}