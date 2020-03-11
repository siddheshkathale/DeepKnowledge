package com.deepknowledge.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.deepknowledge.model.CommonResponse
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.text.Editable
import android.text.TextWatcher
import com.deepknowledge.model.RegistrationRequest
import com.deepknowledge.presenter.IRegistrationResultCallBack
import com.deepknowledge.remote.Repository
import com.deepknowledge.util.Constant


class RegistrationViewModel(application: Application, val listener: IRegistrationResultCallBack) : AndroidViewModel(application) {

    private val registrationData: LiveData<CommonResponse>? = null

    private val repository = Repository()

    private val registrationRequest: RegistrationRequest

    val constant:Constant? = null

    init {
        registrationRequest = RegistrationRequest("","","","")
        registrationRequest.setDeviceId(constant!!.getDevice(application))
    }

    val emailTextWatcher:TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                registrationRequest.setEmailAddress(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        }

    val fullnameTextWatcher:TextWatcher
        get() = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            registrationRequest.setFullName(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }
    }

    val passwordTextWatcher:TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                registrationRequest.setPasswords(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        }


    fun registration(){
        if(registrationRequest.isDataValid)
            repository.getRegistration(registrationRequest)
        else
            listener.error("")
    }

    fun getRegistrationData(): LiveData<CommonResponse> {
        return registrationData!!
    }

}