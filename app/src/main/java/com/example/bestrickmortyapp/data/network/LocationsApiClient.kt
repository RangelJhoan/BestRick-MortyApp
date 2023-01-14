package com.example.bestrickmortyapp.data.network

import com.example.bestrickmortyapp.data.model.LocationsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationsApiClient {
    @GET("location")
    suspend fun getAllLocations(@Query("page") page: Int?): Response<LocationsResponse>
}