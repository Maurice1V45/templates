package com.mivas.templates.rest.response

import com.google.gson.annotations.SerializedName

data class GetPostResponse (
        @SerializedName("userId") val userId: Int,
        @SerializedName("id") val id: Int,
        @SerializedName("title") val title: String,
        @SerializedName("body") val body: String
)