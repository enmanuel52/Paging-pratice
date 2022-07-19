package com.example.paging.utils

const val BASE_URL = "https://rickandmortyapi.com"
const val GET_CHARACTER  ="/api/character/"
const val START_PAGE = 1

fun String.getLastAsInt(): Int = this.substring(length-2).let {
    if(it[0].isDigit()) it.toInt() else it[1].toString().toInt()
}