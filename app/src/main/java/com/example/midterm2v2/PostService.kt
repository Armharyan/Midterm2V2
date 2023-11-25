package com.example.midterm2v2

import retrofit2.http.GET

interface PostService {
    @GET("Posts")
    suspend fun getPosts(): List<Post>
}