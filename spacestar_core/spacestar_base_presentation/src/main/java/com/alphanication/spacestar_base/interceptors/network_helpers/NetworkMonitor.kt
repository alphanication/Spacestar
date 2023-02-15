package com.sfera_module.base.interceptors.network_helpers

interface NetworkMonitor {
    fun isInternetConnected(): Boolean
    fun isAirplaneMode(): Boolean

    fun isNetworkConnectionCommon(): Boolean
}