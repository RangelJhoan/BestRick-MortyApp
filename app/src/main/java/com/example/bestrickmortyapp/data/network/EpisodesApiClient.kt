package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.data.model.EpisodesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EpisodesApiClient {
    @GET("episode")
    suspend fun getAllEpisodes(@Query("page") page: Int?): Response<EpisodesResponse>
}