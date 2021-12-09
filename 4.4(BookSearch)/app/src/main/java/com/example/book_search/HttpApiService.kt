package com.example.book_search

import retrofit2.http.GET

interface HttpApiService {
    @GET("/books")
    suspend fun getMyBookData():List<Bookdata>
}