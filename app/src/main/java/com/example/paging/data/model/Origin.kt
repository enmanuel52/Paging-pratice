package com.example.paging.data.model

import com.google.gson.annotations.SerializedName

data class Origin(
    @SerializedName(value = "name") val place: String,
)
