package com.alphanication.feature_astronaut_data.services

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrAstronautListData
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.GET_ASTRONAUT_URL
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.LIMIT_KEY
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.OFFSET_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AstronautAPI {

    @GET(GET_ASTRONAUT_URL)
    suspend fun getAstronautes(
        @Query(LIMIT_KEY) limit: Int,
        @Query(OFFSET_KEY) offset: Int
    ): Response<AstrAstronautListData>
}