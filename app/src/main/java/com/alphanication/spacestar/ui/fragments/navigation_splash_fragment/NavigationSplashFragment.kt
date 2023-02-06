package com.alphanication.spacestar.ui.fragments.navigation_splash_fragment

import com.alphanication.spacestar.databinding.FragmentNavigationSplashBinding
import com.alphanication.spacestar_base.ui.fragment.BaseFragment
import javax.inject.Inject

class NavigationSplashFragment :
    BaseFragment<NavigationSplashViewModel, FragmentNavigationSplashBinding>(
        FragmentNavigationSplashBinding::inflate
    ) {

    @Inject
    override lateinit var factory: NavigationSplashViewModel.Factory

    override val viewModel: NavigationSplashViewModel by assistedViewModel()
}