package com.deepknowledge.remote


import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class Repository
{

    var apiService : APIService? = null

    init {
        apiService = ApiClient.client!!.create(APIService::class.java)
    }

}

