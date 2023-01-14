package com.example.bestrickmortyapp.domain

import com.example.bestrickmortyapp.data.CharactersRepository

class GetCharacterImageUseCase {

    private val repository = CharactersRepository()

    suspend operator fun invoke(id: Int): String = repository.getCharacterImage(id)

}