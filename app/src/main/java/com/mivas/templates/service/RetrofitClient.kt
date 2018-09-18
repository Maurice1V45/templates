package com.mivas.templates.service

import com.google.gson.GsonBuilder
import com.mivas.templates.BuildConfig
import com.mivas.templates.util.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val service: TemplateService

    init {
        val interceptor = HttpLoggingInterceptor();
        interceptor.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder().baseUrl(Constants.URL_BASE).client(client).addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()
        service = retrofit.create(TemplateService::class.java)
    }
}