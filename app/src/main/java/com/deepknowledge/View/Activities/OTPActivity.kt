package com.deepknowledge.View.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.deepknowledge.R
import com.deepknowledge.databinding.ActivityOtpBinding
import com.deepknowledge.presenter.IOTPVerificationCallBack

class OTPActivity : AppCompatActivity() {

    var dataBinding:ActivityOtpBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_otp)

        init()
    }

    private fun init() {
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_otp)

        dataBinding!!.iotpVerificationCallBack = object:IOTPVerificationCallBack{
            override fun otpVerificationBack() {


            }

            override fun btnOTPVerification() {


            }

            override fun resendOTP() {

            }

        }

    }

}
