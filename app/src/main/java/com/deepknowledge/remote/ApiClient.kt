package com.deepknowledge.remote

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


object ApiClient
{

    //private const val DOMAIN_NAME   = "http://basicproject.nteknova.com/"
    //private const val BASE_URL      = DOMAIN_NAME + "WebServiceHighway.asmx/"

    private const val DOMAIN_NAME   = "http://demo.frugalnova.co.uk/"
    private const val BASE_URL      = DOMAIN_NAME + "api/phonics/"

    private var retrofit: Retrofit? = null


    val client: Retrofit?
        get()
        {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return this.retrofit
        }



}