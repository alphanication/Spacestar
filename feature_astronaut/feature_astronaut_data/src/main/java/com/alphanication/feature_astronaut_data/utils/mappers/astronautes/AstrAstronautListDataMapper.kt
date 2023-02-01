package com.alphanication.feature_astronaut_data.utils.mappers.astronautes

import com.alphanication.feature_astronaut_data.data_models.astronautes.AstrAstronautListData
import com.alphanication.feature_astronaut_data.utils.constants.NumberConstants.DEFAULT_INT
import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrAstronautListDataD

fun AstrAstronautListData.toDomainModel() = AstrAstronautListDataD(
    count = count ?: DEFAULT_INT,
    astrAstronauts = astrAstronauts?.map { it.toDomainModel() } ?: listOf()
)