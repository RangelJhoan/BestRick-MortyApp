package com.example.bestrickmortyapp.domain

import com.example.bestrickmortyapp.data.EpisodesRepository
import com.example.bestrickmortyapp.data.model.Episode
import com.example.bestrickmortyapp.data.model.EpisodesResponse

class GetEpisodesUseCase {

    private val repository = EpisodesRepository()

    suspend operator fun invoke(page: Int?): EpisodesResponse = repository.getAllEpisodes(page)

}