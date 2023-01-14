package com.example.bestrickmortyapp.data.model

import java.util.*

data class Locations(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: List<String>,
    val url: String,
    val created: Date,
    var coverImage: String
)