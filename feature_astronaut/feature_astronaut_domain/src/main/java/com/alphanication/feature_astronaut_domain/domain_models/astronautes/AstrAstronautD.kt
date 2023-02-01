package com.alphanication.feature_astronaut_domain.domain_models.astronautes

data class AstrAstronautD(
    val age: Int,
    val astrAgencyData: AstrAgencyDataD,
    val bio: String,
    val dateOfBirth: String,
    val dateOfDeath: String,
    val firstFlight: String,
    val flightsCount: Int,
    val id: Int,
    val instagram: String,
    val landingsCount: Int,
    val lastFlight: String,
    val name: String,
    val nationality: String,
    val profileImage: String,
    val profileImageThumbnail: String,
    val status: AstrStatusD,
    val twitter: String,
    val astrType: AstrTypeD,
    val url: String,
    val wiki: String
)