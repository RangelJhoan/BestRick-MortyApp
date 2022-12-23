package com.example.bestrickmortyapp.data

import com.example.bestrickmortyapp.data.network.CharactersService
import com.example.bestrickmortyapp.data.model.CharacterList
import com.example.bestrickmortyapp.data.model.CharactersProvider

class CharactersRepository {
    private val api = CharactersService()

    suspend fun getAllCharacters(): CharacterList {
        val response = api.getCharacters()
        CharactersProvider.characters = response!!
        return response
    }
}