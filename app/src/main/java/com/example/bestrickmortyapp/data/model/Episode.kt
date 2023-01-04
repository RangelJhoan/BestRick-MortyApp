package com.example.bestrickmortyapp.data.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Episode(
    var id: Int,
    var name: String,
    @SerializedName("air_date") var airDate: String,
    var episode: String,
    var characters: List<String>,
    var url: String,
    var created: Date
)
