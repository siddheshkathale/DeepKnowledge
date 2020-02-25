package com.deepknowledge.view.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.deepknowledge.R

import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.deepknowledge.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    //var dataBinding:Act? = null

    var dataBinding:ActivitySplashBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_splash)

        setupAnimation()

    }

    private fun setupAnimation() {

        val slide_up = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_up
        )


        //dataBinding!!.imgLady.visibility = View.VISIBLE
        //dataBinding!!.imgGrass.visibility = View.VISIBLE

        //dataBinding!!.imgLady.startAnimation(slide_up)
        //dataBinding!!.imgGrass.startAnimation(slide_up)

        //dataBinding!!.imgSplash.visibility = View.GONE
    }

}
