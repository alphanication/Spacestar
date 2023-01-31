package com.alphanication.spacestar_base.interceptors

import com.sfera_module.base.interceptors.network_helpers.NetworkMonitor
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject

class ConnectionNetworkException : IOException()
class FlightModeException : IOException()

class NetworkInterceptor @Inject constructor(
    private val networkMonitor: NetworkMonitor
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response =
        when {
            networkMonitor.isInternetConnected().not() -> throw ConnectionNetworkException()
            networkMonitor.isAirplaneMode() -> throw FlightModeException()
            else -> chain.proceed(chain.request())
        }
}