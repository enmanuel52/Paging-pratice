package com.example.paging.data.repo

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.paging.data.api.ApiService
import com.example.paging.data.model.ApiResponse
import com.example.paging.data.model.Character
import com.example.paging.domain.usecases.GetAllCharactersUC
import com.example.paging.domain.usecases.GetCharactersByPage
import com.example.paging.utils.START_PAGE
import com.example.paging.utils.getLastAsInt
import javax.inject.Inject

class MainPagingSource @Inject constructor(
    private val apiService: ApiService
) : PagingSource<Int, Character>() {
    override fun getRefreshKey(state: PagingState<Int, Character>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)

        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Character> {
        val page = params.key ?: START_PAGE
        val response = apiService.getCharatersByPage(page).body()
        val info = response?.info!!

        return LoadResult.Page(
            data = response.characters,
            prevKey = info.prev?.getLastAsInt(),
            nextKey = info.next?.getLastAsInt(),
        )
    }
}