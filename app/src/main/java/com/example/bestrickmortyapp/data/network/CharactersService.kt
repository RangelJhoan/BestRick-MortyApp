package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.core.RetrofitHelper
import com.example.bestrickmortyapp.data.model.CharactersResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharactersService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCharacters(page: Int?): CharactersResponse?{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(CharactersApiClient::class.java).getAllCharacters(page)
            response.body()
        }
    }

    suspend fun getCharacterImage(id: Int): String{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(CharactersApiClient::class.java).getCharacter(id)
            response.body()?.image ?: ""
        }
    }
}