package com.alphanication.feature_astronaut_data.data_models.astronautes

import com.alphanication.feature_astronaut_data.utils.StringConstants.DATE_OF_BIRTH_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.DATE_OF_DEATH_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.FIRST_FLIGHT_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.FLIGHTS_COUNT_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.LANDINGS_COUNT_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.LAST_FLIGHT_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.PROFILE_IMAGE_FIELD
import com.alphanication.feature_astronaut_data.utils.StringConstants.PROFILE_IMAGE_THUMBNAIL
import com.google.gson.annotations.SerializedName

data class AstrResult(
    val age: Int?,
    val astrAgencyData: AstrAgencyData?,
    val bio: String?,
    @SerializedName(DATE_OF_BIRTH_FIELD)
    val dateOfBirth: String?,
    @SerializedName(DATE_OF_DEATH_FIELD)
    val dateOfDeath: String?,
    @SerializedName(FIRST_FLIGHT_FIELD)
    val firstFlight: String?,
    @SerializedName(FLIGHTS_COUNT_FIELD)
    val flightsCount: Int?,
    val id: Int?,
    val instagram: String?,
    @SerializedName(LANDINGS_COUNT_FIELD)
    val landingsCount: Int?,
    @SerializedName(LAST_FLIGHT_FIELD)
    val lastFlight: String?,
    val name: String?,
    val nationality: String?,
    @SerializedName(PROFILE_IMAGE_FIELD)
    val profileImage: String?,
    @SerializedName(PROFILE_IMAGE_THUMBNAIL)
    val profileImageThumbnail: String?,
    val astrStatus: AstrStatus?,
    val twitter: String?,
    val astrType: AstrType?,
    val url: String?,
    val wiki: String?
)