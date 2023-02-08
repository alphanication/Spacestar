package com.alphanication.spacestar.ui.fragments.navigation_splash_fragment

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.alphanication.spacestar.databinding.FragmentNavigationSplashBinding
import com.alphanication.spacestar_base.ui.fragment.BaseFragment
import com.alphanication.spacestar_navigation.NavigationDeepLinks
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val DELAY_SPLASH_SCREEN = 1000L

class NavigationSplashFragment :
    BaseFragment<NavigationSplashViewModel, FragmentNavigationSplashBinding>(
        FragmentNavigationSplashBinding::inflate
    ) {

    @Inject
    override lateinit var factory: NavigationSplashViewModel.Factory

    override val viewModel: NavigationSplashViewModel by assistedViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToAstronautFeatureModule()

    }

    private fun navigateToAstronautFeatureModule() = lifecycleScope.launch {
        delay(DELAY_SPLASH_SCREEN)
        findNavController().navigate(
            Uri.parse(
                NavigationDeepLinks.FEATURE_ASTRONAUT_MAIN_DEEP_LINK
            )
        )
    }
}