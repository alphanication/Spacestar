package com.alphanication.spacestar.di_based.components

import android.app.Application
import android.content.Context
import com.alphanication.spacestar.di_based.modules.ApplicationModule
import com.alphanication.spacestar_di.modules.CoreNetworkModule
import com.alphanication.spacestar_di.providers.CoreDependenciesProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        CoreNetworkModule::class
    ]
)
interface ApplicationComponent : CoreDependenciesProvider {

    fun inject(application: Application)

    // BASED PROVIDER'S
    override fun provideApplication(): Application
    override fun provideContext(): Context
}