package com.mivas.templates.service

import com.mivas.templates.rest.request.PostPostRequest
import com.mivas.templates.rest.response.GetPostResponse
import com.mivas.templates.util.Constants
import retrofit2.Call
import retrofit2.http.*

interface TemplateService {

    @GET(Constants.URL_GET_POST)
    fun getPost(@Path("id") id: Int): Call<GetPostResponse>

    @GET(Constants.URL_GET_POSTS)
    fun getPosts(): Call<List<GetPostResponse>>

    @FormUrlEncoded
    @POST(Constants.URL_POST_POST)
    fun postPosts(@Field("title") title: String, @Field("body") body: String): Call<GetPostResponse>

    @POST(Constants.URL_POST_POST)
    fun postPosts2(@Body request: PostPostRequest): Call<GetPostResponse>

    @FormUrlEncoded
    @PUT(Constants.URL_PUT_POST)
    fun putPost(@Path("id") id: Int, @Field("title") title: String): Call<GetPostResponse>

    @PUT(Constants.URL_DELETE_POST)
    fun deletePost(@Path("id") id: Int): Call<GetPostResponse>
}