package com.deepknowledge.presenter

interface IRegistrationResultCallBack {
    fun success(message:String)
    fun error(message: String)
}