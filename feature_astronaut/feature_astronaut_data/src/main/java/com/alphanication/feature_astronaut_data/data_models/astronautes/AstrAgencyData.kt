package com.alphanication.feature_astronaut_data.data_models.astronautes

import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.COUNTRY_CODE_FIELD
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.FOUNDING_YEAR_FIELD
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.IMAGE_URL_FIELD
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.LOGO_URL_FIELD
import com.google.gson.annotations.SerializedName

data class AstrAgencyData(
    val abbrev: String?,
    val administrator: String?,
    @SerializedName(COUNTRY_CODE_FIELD)
    val countryCode: String?,
    val description: String?,
    val featured: Boolean?,
    @SerializedName(FOUNDING_YEAR_FIELD)
    val foundingYear: String?,
    val id: Int?,
    @SerializedName(IMAGE_URL_FIELD)
    val imageUrl: String?,
    val launchers: String?,
    @SerializedName(LOGO_URL_FIELD)
    val logoUrl: String?,
    val name: String?,
    val parent: String?,
    val spacecraft: String?,
    val type: String?,
    val url: String?
)