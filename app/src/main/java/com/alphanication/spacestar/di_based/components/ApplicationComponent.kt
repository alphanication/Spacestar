package com.alphanication.spacestar.di_based.components

import android.app.Application
import android.content.Context
import com.alphanication.spacestar.di_based.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class
    ]
)
interface ApplicationComponent {

    // BASED PROVIDER'S
    fun provideApplication(): Application
    fun provideContext(): Context
}