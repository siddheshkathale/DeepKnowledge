package com.deepknowledge.remote

import com.deepknowledge.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface APIService
{

    @POST("Registration")
    fun Registration(@Body registrationRequest: RegistrationRequest):Call<CommonResponse>


    @POST("Login")
    fun Login(@Body loginRequest: LoginRequest):Call<CommonResponse>


    @POST("ValidateOTP")
    fun ValidateOTP(@Body validateOTPRequest: ValidateOTPRequest):Call<CommonResponse>


    @POST("ResendOTP")
    fun ResendOTP(@Body resendOTPRequest: ResendOTPRequest):Call<CommonResponse>

}