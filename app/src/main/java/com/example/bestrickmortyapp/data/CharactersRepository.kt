package com.example.bestrickmortyapp.data

import com.example.bestrickmortyapp.data.network.CharactersService
import com.example.bestrickmortyapp.data.model.CharacterList
import com.example.bestrickmortyapp.data.model.CharactersProvider

class CharactersRepository {
    private val api = CharactersService()

    suspend fun getAllCharacters(page: Int?): CharacterList {
        val response = api.getCharacters(page)
        CharactersProvider.characters = response!!
        return response
    }
}