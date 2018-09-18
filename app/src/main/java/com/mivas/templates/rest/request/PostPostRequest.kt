package com.mivas.templates.rest.request

data class PostPostRequest(
        val userId: Int,
        val id: Int,
        val title: String,
        val body: String

)