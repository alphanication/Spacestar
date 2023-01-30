package com.alphanication.spacestar.app

import android.app.Application
import com.alphanication.spacestar.di_based.components.ApplicationComponent
import com.alphanication.spacestar.di_based.components.DaggerApplicationComponent
import com.alphanication.spacestar.di_based.modules.ApplicationModule

class App : Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        setupDagger()
    }

    private fun setupDagger() {
        applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(
                ApplicationModule(this)
            )
            .build()
    }
}