package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.data.model.CharactersResponse
import com.example.bestrickmortyapp.data.model.Character
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersApiClient {
    @GET("character")
    suspend fun getAllCharacters(@Query("page") page: Int?): Response<CharactersResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}