package com.example.spacestar_util.results

import java.io.IOException

enum class StatusNetworkResult {
    SUCCESS,
    ERROR
}

data class NetworkResult<out T>(
    val status: StatusNetworkResult,
    val data: T? = null,
    val errorThrowable: Throwable? = null
) {
    companion object {
        fun <T> success(data: T? = null): NetworkResult<T> =
            NetworkResult(StatusNetworkResult.SUCCESS, data)

        fun <T> error(errorModel: Throwable, data: T? = null): NetworkResult<T> =
            NetworkResult(StatusNetworkResult.ERROR, data, errorModel)
    }
}

sealed class ErrorTypes : IOException() {

    data class AnotherError(
        val errorMessage: String,
        val errorCode: String? = null
    ) : ErrorTypes()
}
