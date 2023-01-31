package com.alphanication.spacestar.di_based.components

import android.app.Application
import android.content.Context
import com.alphanication.spacestar.di_based.modules.ApplicationModule
import com.alphanication.spacestar_di.providers.CoreDependenciesProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface ApplicationComponent : CoreDependenciesProvider {

    // BASED PROVIDER'S
    override fun provideApplication(): Application
    override fun provideContext(): Context
}