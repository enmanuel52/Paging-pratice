package com.example.paging.data.model

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName(value = "count") val count: Int,
    @SerializedName(value = "pages") val pages: Int,
    @SerializedName(value = "next") val next: String?,
    @SerializedName(value = "prev") val prev: String?,
)
