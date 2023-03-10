package com.example.bestrickmortyapp.domain

import com.example.bestrickmortyapp.data.CharactersRepository
import com.example.bestrickmortyapp.data.model.CharactersResponse

class GetCharactersUseCase {

    private val repository = CharactersRepository()

    suspend operator fun invoke(page: Int?): CharactersResponse = repository.getAllCharacters(page)

}