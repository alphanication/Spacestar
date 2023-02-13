package com.alphanication.feature_astronaut_domain.repository

import com.alphanication.feature_astronaut_domain.domain_models.astronautes.AstrAstronautListDataD

interface AstronautRepository {
    suspend fun getAstronautes(): AstrAstronautListDataD
}