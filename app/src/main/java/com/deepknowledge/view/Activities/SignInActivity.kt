package com.deepknowledge.view.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.deepknowledge.presenter.ILoginCallBack
import com.deepknowledge.R
import com.deepknowledge.databinding.ActivityLoginBinding


class SignInActivity : AppCompatActivity() {

    var dataBinding: ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)

        init()

    }

    fun init(){

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)

        dataBinding!!.iLoginCallBack = object: ILoginCallBack{
            override fun loginBack() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun btnLogin() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun forgetPassword() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun createAccount() {
                startActivity(Intent(this@SignInActivity,CreateAccountActivity::class.java))
            }

        }

    }

}
