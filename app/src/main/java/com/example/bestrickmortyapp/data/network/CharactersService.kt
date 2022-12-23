package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.core.RetrofitHelper
import com.example.bestrickmortyapp.data.model.Character
import com.example.bestrickmortyapp.data.model.CharacterList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharactersService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCharacters(): CharacterList?{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(CharactersApiClient::class.java).getAllCharacters()
            println("Body Service ${response.body()}")
            response.body()
        }
    }
}