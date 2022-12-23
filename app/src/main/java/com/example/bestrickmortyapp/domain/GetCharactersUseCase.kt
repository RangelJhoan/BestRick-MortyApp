package com.example.bestrickmortyapp.domain

import com.example.bestrickmortyapp.data.CharactersRepository
import com.example.bestrickmortyapp.data.model.CharacterList

class GetCharactersUseCase {

    private val repository = CharactersRepository()

    suspend operator fun invoke(): CharacterList = repository.getAllCharacters()

}