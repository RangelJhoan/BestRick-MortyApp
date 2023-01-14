package com.example.bestrickmortyapp.domain

import com.example.bestrickmortyapp.data.LocationsRepository
import com.example.bestrickmortyapp.data.model.LocationsResponse

class GetLocationsUseCase {

    private val repository = LocationsRepository()

    suspend operator fun invoke(page: Int?): LocationsResponse = repository.getAllLocations(page)

}