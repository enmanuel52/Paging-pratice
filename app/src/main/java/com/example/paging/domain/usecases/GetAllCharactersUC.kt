package com.example.paging.domain.usecases

import com.example.paging.data.api.ApiService
import javax.inject.Inject

class GetAllCharactersUC @Inject constructor(
    private val apiService: ApiService,
) {
    operator fun invoke() = apiService.getAllCharacters().body()?.characters
}