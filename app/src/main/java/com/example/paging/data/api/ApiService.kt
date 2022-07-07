package com.example.paging.data.api

import com.example.paging.data.model.ApiResponse
import retrofit2.http.GET

interface ApiService {
    @GET("/character")
    suspend fun getAllCharacters(): ApiResponse
}