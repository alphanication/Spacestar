package com.alphanication.spacestar_di.providers

import android.app.Application
import android.content.Context

interface CoreApplicationProvider {

    fun provideApplication(): Application
    fun provideContext(): Context
}