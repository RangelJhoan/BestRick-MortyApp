package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.core.RetrofitHelper
import com.example.bestrickmortyapp.data.model.Episode
import com.example.bestrickmortyapp.data.model.EpisodesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class EpisodesService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getEpisodes(page: Int?): EpisodesResponse?{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(EpisodesApiClient::class.java).getAllEpisodes(page)
            response.body()
        }
    }
}