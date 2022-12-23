package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.data.model.CharacterList
import retrofit2.Response
import retrofit2.http.GET

interface CharactersApiClient {
    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterList>
}