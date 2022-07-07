package com.example.paging.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName(value = "info") val info: Info,
    @SerializedName(value = "results") val characters: List<Character>,
)
