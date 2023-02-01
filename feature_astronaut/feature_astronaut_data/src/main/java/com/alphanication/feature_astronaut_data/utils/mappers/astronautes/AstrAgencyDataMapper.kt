package com.alphanication.feature_astronaut_data.utils.mappers.astronautes

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrAgencyData
import com.alphanication.feature_astronaut_data.utils.constants.BooleanConstants.DEFAULT_BOOLEAN
import com.alphanication.feature_astronaut_data.utils.constants.NumberConstants.DEFAULT_INT
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.EMPTY_STRING
import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrAgencyDataD

fun AstrAgencyData.toDomainModel() = AstrAgencyDataD(
    abbrev = abbrev ?: EMPTY_STRING,
    administrator = administrator ?: EMPTY_STRING,
    countryCode = countryCode ?: EMPTY_STRING,
    description = description ?: EMPTY_STRING,
    featured = featured ?: DEFAULT_BOOLEAN,
    foundingYear = foundingYear ?: EMPTY_STRING,
    id = id ?: DEFAULT_INT,
    imageUrl = imageUrl ?: EMPTY_STRING,
    launchers = launchers ?: EMPTY_STRING,
    logoUrl = logoUrl ?: EMPTY_STRING,
    name = name ?: EMPTY_STRING,
    parent = parent ?: EMPTY_STRING,
    spacecraft = spacecraft ?: EMPTY_STRING,
    type = type ?: EMPTY_STRING,
    url = url ?: EMPTY_STRING
)

fun astrAgencyDataEmpty() = AstrAgencyDataD(
    abbrev = EMPTY_STRING,
    administrator = EMPTY_STRING,
    countryCode = EMPTY_STRING,
    description = EMPTY_STRING,
    featured = DEFAULT_BOOLEAN,
    foundingYear = EMPTY_STRING,
    id = DEFAULT_INT,
    imageUrl = EMPTY_STRING,
    launchers = EMPTY_STRING,
    logoUrl = EMPTY_STRING,
    name = EMPTY_STRING,
    parent = EMPTY_STRING,
    spacecraft = EMPTY_STRING,
    type = EMPTY_STRING,
    url = EMPTY_STRING
)