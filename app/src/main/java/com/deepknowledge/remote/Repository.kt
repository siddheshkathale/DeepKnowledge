package com.deepknowledge.remote


import android.util.Log
import com.deepknowledge.model.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Body


class Repository
{

    var TAG_RESPONSE    = "RESPONSE"
    var TAG_ERROR       = "ERROR"

    var apiService : APIService? = null

    init {
        apiService = ApiClient.client!!.create(APIService::class.java)
    }

    fun getLogin(loginRequest: LoginRequest) {

        apiService?.Login(loginRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>)
            {
                Log.d(TAG_RESPONSE," Login code:: " + response.code())


            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable)
            {
                Log.d(TAG_ERROR," Login:: " +t.toString())

            }
        })

    }

    fun getRegistration(registrationRequest: RegistrationRequest) {

        apiService?.Registration(registrationRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>)
            {
                Log.d(TAG_RESPONSE," Registration code:: " + response.code())


            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable)
            {
                Log.d(TAG_ERROR," Registration:: " +t.toString())

            }
        })

    }

    fun getValidateOTP(validateOTPRequest: ValidateOTPRequest){

        apiService?.ValidateOTP(validateOTPRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>)
            {
                Log.d(TAG_RESPONSE," ValidateOTP code:: " + response.code())


            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable)
            {
                Log.d(TAG_ERROR," ValidateOTP:: " +t.toString())

            }
        })

    }

    fun getResendOTP(resendOTPRequest: ResendOTPRequest) {

        apiService?.ResendOTP(resendOTPRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>)
            {
                Log.d(TAG_RESPONSE," ResendOTP code:: " + response.code())


            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable)
            {
                Log.d(TAG_ERROR," ResendOTP:: " +t.toString())

            }
        })
    }

}

