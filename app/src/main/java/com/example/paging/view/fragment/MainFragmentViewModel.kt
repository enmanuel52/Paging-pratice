package com.example.paging.view.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.paging.data.api.ApiService
import com.example.paging.data.repo.MainPagingSource
import com.example.paging.domain.usecases.GetCharactersByPage
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val getCharactersByPage: GetCharactersByPage,
) : ViewModel() {

    val flow = Pager(
        config = PagingConfig(pageSize = 20, enablePlaceholders = false),
        pagingSourceFactory = { MainPagingSource(getCharactersByPage) }
    ).flow
        .cachedIn(viewModelScope)
}