package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.data.model.CharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharactersApiClient {

    @GET("character")
    suspend fun getAllCharacters(@Query("page") page: Int?): Response<CharacterList>
}