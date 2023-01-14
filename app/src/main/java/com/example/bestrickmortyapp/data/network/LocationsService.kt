package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.core.RetrofitHelper
import com.example.bestrickmortyapp.data.model.LocationsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LocationsService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getLocations(page: Int?): LocationsResponse? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(LocationsApiClient::class.java).getAllLocations(page)
            response.body()
        }
    }
}