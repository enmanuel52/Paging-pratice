package com.example.paging.utils

const val BASE_URL = "https://rickandmortyapi.com"
const val GET_CHARACTER  ="/api/character/"
const val START_PAGE = 1

fun String.getLastAsInt(): Int = this[this.length - 1].let {
    if(it.isDigit()) it.toString().toInt() else 0
}