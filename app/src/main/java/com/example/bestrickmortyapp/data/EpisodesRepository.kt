package com.example.bestrickmortyapp.data

import com.example.bestrickmortyapp.data.model.Episode
import com.example.bestrickmortyapp.data.model.EpisodesResponse
import com.example.bestrickmortyapp.data.network.EpisodesService

class EpisodesRepository {
    private val api = EpisodesService()

    suspend fun getAllEpisodes(page: Int?): EpisodesResponse{
        val response = api.getEpisodes(page)
        return response!!
    }
}