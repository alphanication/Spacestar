package com.alphanication.feature_astronaut_data.utils.mappers.astronautes

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrType
import com.alphanication.feature_astronaut_data.utils.constants.NumberConstants.DEFAULT_INT
import com.alphanication.feature_astronaut_data.utils.constants.StringConstants.EMPTY_STRING
import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrTypeD

fun AstrType.toDomainModel() = AstrTypeD(
    id = id ?: DEFAULT_INT,
    name = name ?: EMPTY_STRING
)

fun astrTypeEmpty() = AstrTypeD(
    id = DEFAULT_INT,
    name = EMPTY_STRING
)