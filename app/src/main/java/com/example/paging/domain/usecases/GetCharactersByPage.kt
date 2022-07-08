package com.example.paging.domain.usecases

import com.example.paging.data.api.ApiService
import javax.inject.Inject

class GetCharactersByPage @Inject constructor(
    private val apiService: ApiService,
) {
    operator fun invoke(page: Int) = apiService.getCharatersByPage(page).body()?.characters
}