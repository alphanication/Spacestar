package com.alphanication.spacestar_di.modules

import android.content.Context
import com.alphanication.spacestar_base.interceptors.NetworkInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.sfera_module.base.interceptors.network_helpers.LiveNetworkMonitor
import com.sfera_module.base.interceptors.network_helpers.NetworkMonitor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val DEFAULT_HTTP_REQUEST_TIMEOUT = 5L

@Module
class CoreNetworkModule {

        @Singleton
        @Provides
        fun provideNetworkMonitor(
            context: Context
        ): NetworkMonitor = LiveNetworkMonitor(
            context = context
        )

        @Provides
        @Singleton
        fun provideNetworkInterceptor(
            networkMonitor: NetworkMonitor
        ): NetworkInterceptor = NetworkInterceptor(
            networkMonitor = networkMonitor
        )

        @Singleton
        @Provides
        fun provideOkHttpClient(
            networkInterceptor: NetworkInterceptor
        ): OkHttpClient =
            OkHttpClient.Builder()
                .connectTimeout(DEFAULT_HTTP_REQUEST_TIMEOUT, TimeUnit.MINUTES)
                .writeTimeout(DEFAULT_HTTP_REQUEST_TIMEOUT, TimeUnit.MINUTES)
                .readTimeout(DEFAULT_HTTP_REQUEST_TIMEOUT, TimeUnit.MINUTES)
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
                .addInterceptor(networkInterceptor)
                .build()
}