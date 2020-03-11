package com.deepknowledge.remote


import android.util.Log
import androidx.lifecycle.LiveData
import com.deepknowledge.model.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Body
import androidx.lifecycle.MutableLiveData

class Repository
{

    var TAG_RESPONSE    = "RESPONSE"
    var TAG_ERROR       = "ERROR"

    var apiService : APIService? = null


    init {
        apiService = ApiClient.client!!.create(APIService::class.java)
    }

    fun getLogin(loginRequest: LoginRequest): LiveData<CommonResponse> {

        val data = MutableLiveData<CommonResponse>()

        apiService?.Login(loginRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>) {
                Log.d(TAG_RESPONSE," Login code:: " + response.code())
                data.value = response.body();
            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                Log.d(TAG_ERROR," Login:: " +t.toString())
                data.value = null;
            }
        })

        return data
    }

    fun getRegistration(registrationRequest: RegistrationRequest): LiveData<CommonResponse> {

        val data = MutableLiveData<CommonResponse>()

        apiService?.Registration(registrationRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>) {
                Log.d(TAG_RESPONSE," Registration code:: " + response.code())
            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                Log.d(TAG_ERROR," Registration:: " +t.toString())
            }
        })
        return data
    }

    fun getValidateOTP(validateOTPRequest: ValidateOTPRequest) : LiveData<CommonResponse>{

        val data = MutableLiveData<CommonResponse>()

        apiService?.ValidateOTP(validateOTPRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>) {
                Log.d(TAG_RESPONSE," ValidateOTP code:: " + response.code())
            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                Log.d(TAG_ERROR," ValidateOTP:: " +t.toString())
            }
        })
        return data
    }

    fun getResendOTP(resendOTPRequest: ResendOTPRequest) : LiveData<CommonResponse> {

        val data = MutableLiveData<CommonResponse>()

        apiService?.ResendOTP(resendOTPRequest)?.enqueue(object : Callback<CommonResponse>
        {
            override fun onResponse(call: Call<CommonResponse>, response: Response<CommonResponse>) {
                Log.d(TAG_RESPONSE," ResendOTP code:: " + response.code())
            }

            override fun onFailure(call: Call<CommonResponse>, t: Throwable) {
                Log.d(TAG_ERROR," ResendOTP:: " +t.toString())
            }
        })

        return data

    }

}

