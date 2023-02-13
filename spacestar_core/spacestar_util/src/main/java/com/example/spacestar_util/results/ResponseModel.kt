package com.example.spacestar_util.results

import java.io.IOException

enum class Status {
    SUCCESS,
    ERROR
}

data class ResponseModel<out T>(
    val status: Status,
    val data: T?,
    val errorThrowable: Throwable? = null
) {
    companion object {
        fun <T> success(data: T? = null): ResponseModel<T> =
            ResponseModel(Status.SUCCESS, data)

        fun <T> error(errorModel: Throwable, data: T? = null): ResponseModel<T> =
            ResponseModel(Status.ERROR, data, errorModel)
    }
}

class AnotherError(
    val messageError: String,
    val errorCode: Int?
) : IOException()