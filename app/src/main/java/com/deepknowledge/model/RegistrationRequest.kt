package com.deepknowledge.model

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable

class RegistrationRequest(private var Fullname:String,
                          private var Password:String,
                          private var Email:String,
                          private var DeviceID:String): BaseObservable() {

    val isDataValid:Boolean
    get() = (!TextUtils.isEmpty(getEmailAddress()))
            && Patterns.EMAIL_ADDRESS.matcher(getEmailAddress()).matches()
            && (!TextUtils.isEmpty(getPasswords()))
            && (!TextUtils.isEmpty(getFullName()))


    fun getEmailAddress():String {
        return Email
    }

    fun getFullName():String{
        return Fullname
    }

    fun getPasswords():String{
        return Password
    }

    fun getDeviceId(deviceID:String):String{
        return DeviceID
    }

    fun setEmailAddress(email:String){
        this.Email = email
    }

    fun setFullName(fullname:String){
        this.Fullname = fullname
    }

    fun setPasswords(password:String){
        this.Password = password
    }

    fun setDeviceId(deviceID:String){
        this.DeviceID = deviceID
    }

}

