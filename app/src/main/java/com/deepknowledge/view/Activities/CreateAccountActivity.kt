package com.deepknowledge.view.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.deepknowledge.R
import com.deepknowledge.databinding.ActivityCreateAccountBinding
import com.deepknowledge.presenter.*

class CreateAccountActivity : AppCompatActivity() {

    var dataBinding:ActivityCreateAccountBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_create_account)

        init()

    }

    private fun init() {

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_create_account)

        dataBinding!!.iCreateAccountCallBack = object: ICreateAccountCallBack{
            override fun btnGetOTP() {
                startActivity(Intent(this@CreateAccountActivity,OTPActivity::class.java))
            }

            override fun signIn() {
                //startActivity(Intent(this@CreateAccountActivity,SignInActivity::class.java))
                finish()
            }

        }
    }
}
