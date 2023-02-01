package com.alphanication.feature_astronaut_data.utils.mappers.astronautes

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrStatus
import com.alphanication.feature_astronaut_data.utils.constants.NumberConstants.DEFAULT_INT
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.EMPTY_STRING
import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrStatusD

fun AstrStatus.toDomainModel() = AstrStatusD(
    id = id ?: DEFAULT_INT,
    name = name ?: EMPTY_STRING
)

fun astrStatusEmpty() = AstrStatusD(
    id = DEFAULT_INT,
    name = EMPTY_STRING
)