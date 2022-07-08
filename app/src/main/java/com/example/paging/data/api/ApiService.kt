package com.example.paging.data.api

import com.example.paging.data.model.ApiResponse
import com.example.paging.utils.GET_CHARACTER
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET()
    fun getAllCharacters(): Response<ApiResponse>

    @GET(GET_CHARACTER)
    fun getCharatersByPage(@Query("page") page: Int): Response<ApiResponse>
}