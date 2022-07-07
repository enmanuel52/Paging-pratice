package com.example.paging.data.model

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName(value = "id") val id: Int,
    @SerializedName(value = "name") val name: String,
    @SerializedName(value = "status") val status: String,
    @SerializedName(value = "species") val race: String,
    @SerializedName(value = "gender") val gender: String,
    @SerializedName(value = "origin") val origin: Origin,
    @SerializedName(value = "image") val image: String,
)