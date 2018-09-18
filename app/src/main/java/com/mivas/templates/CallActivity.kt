package com.mivas.templates

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mivas.templates.rest.request.PostPostRequest
import com.mivas.templates.rest.response.GetPostResponse
import com.mivas.templates.service.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        startGetPostCall(1)
    }

    fun startGetPostCall(id: Int) {
        val call = RetrofitClient.service.getPost(id)
        call.enqueue(object : Callback<GetPostResponse> {
            override fun onResponse(call: Call<GetPostResponse>?, response: Response<GetPostResponse>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<GetPostResponse>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }

    fun startGetPostsCall() {
        val call = RetrofitClient.service.getPosts()
        call.enqueue(object : Callback<List<GetPostResponse>> {
            override fun onResponse(call: Call<List<GetPostResponse>>?, response: Response<List<GetPostResponse>>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<List<GetPostResponse>>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }

    fun startPostPostCall() {
        val call = RetrofitClient.service.postPosts("myTitle", "myBody")
        call.enqueue(object : Callback<GetPostResponse> {
            override fun onResponse(call: Call<GetPostResponse>?, response: Response<GetPostResponse>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<GetPostResponse>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }

    fun startPostPostCall2() {
        val call = RetrofitClient.service.postPosts2(PostPostRequest(165436, 2735434, "myTitle", "MyBody"))
        call.enqueue(object : Callback<GetPostResponse> {
            override fun onResponse(call: Call<GetPostResponse>?, response: Response<GetPostResponse>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<GetPostResponse>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }

    fun startPutPostCall() {
        val call = RetrofitClient.service.putPost(1, "myTitle")
        call.enqueue(object : Callback<GetPostResponse> {
            override fun onResponse(call: Call<GetPostResponse>?, response: Response<GetPostResponse>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<GetPostResponse>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }

    fun startDeletePostCall() {
        val call = RetrofitClient.service.deletePost(1)
        call.enqueue(object : Callback<GetPostResponse> {
            override fun onResponse(call: Call<GetPostResponse>?, response: Response<GetPostResponse>?) {
                if (response != null && response.isSuccessful && response.body() != null) {
                    Log.w("asd", response.body().toString())
                } else {
                    Log.w("asd", response?.message())
                }
            }
            override fun onFailure(call: Call<GetPostResponse>?, t: Throwable?) {
                Log.w("asd", t?.message)
            }
        })
    }
}
