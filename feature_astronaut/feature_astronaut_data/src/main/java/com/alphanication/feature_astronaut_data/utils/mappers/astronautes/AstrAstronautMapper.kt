package com.alphanication.feature_astronaut_data.utils.mappers.astronautes

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrAstronaut
import com.alphanication.feature_astronaut_data.utils.constants.NumberConstants.DEFAULT_INT
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.EMPTY_STRING
import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrAstronautD

fun AstrAstronaut.toDomainModel() = AstrAstronautD(
    age = age ?: DEFAULT_INT,
    astrAgencyData = astrAgencyData?.toDomainModel() ?: astrAgencyDataEmpty(),
    bio = bio ?: EMPTY_STRING,
    dateOfBirth = dateOfBirth ?: EMPTY_STRING,
    dateOfDeath = dateOfDeath ?: EMPTY_STRING,
    firstFlight = firstFlight ?: EMPTY_STRING,
    flightsCount = flightsCount ?: DEFAULT_INT,
    id = id ?: DEFAULT_INT,
    instagram = instagram ?: EMPTY_STRING,
    landingsCount = landingsCount ?: DEFAULT_INT,
    lastFlight = lastFlight ?: EMPTY_STRING,
    name = name ?: EMPTY_STRING,
    nationality = nationality ?: EMPTY_STRING,
    profileImage = profileImage ?: EMPTY_STRING,
    profileImageThumbnail = profileImageThumbnail ?: EMPTY_STRING,
    status = status?.toDomainModel() ?: astrStatusEmpty(),
    twitter = twitter ?: EMPTY_STRING,
    astrType = astrType?.toDomainModel() ?: astrTypeEmpty(),
    url = url ?: EMPTY_STRING,
    wiki = wiki ?: EMPTY_STRING
)