package com.example.bestrickmortyapp.data

import com.example.bestrickmortyapp.data.model.LocationsResponse
import com.example.bestrickmortyapp.data.network.LocationsService

class LocationsRepository {
    private val api = LocationsService()

    suspend fun getAllLocations(page: Int?): LocationsResponse{
        val response = api.getLocations(page)
        return response!!
    }
}