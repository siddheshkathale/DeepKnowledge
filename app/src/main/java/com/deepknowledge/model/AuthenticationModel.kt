package com.deepknowledge.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class AuthenticationModel {

    @SerializedName("ID")
    @Expose
    private var iD: Int? = null
    @SerializedName("Fullname")
    @Expose
    private var fullname: String? = null
    @SerializedName("Password")
    @Expose
    private var password: String? = null
    @SerializedName("Email")
    @Expose
    private var email: String? = null
    @SerializedName("DeviceID")
    @Expose
    private var deviceID: String? = null
    @SerializedName("OTP")
    @Expose
    private var oTP: String? = null
    @SerializedName("RegistrationDate")
    @Expose
    private var registrationDate: String? = null
    @SerializedName("IsLogin")
    @Expose
    private var isLogin: Boolean? = null
    @SerializedName("OTPCount")
    @Expose
    private var oTPCount: Int? = null
    @SerializedName("LastLogin")
    @Expose
    private var lastLogin: String? = null

    fun getID(): Int? {
        return iD
    }

    fun setID(iD: Int?) {
        this.iD = iD
    }

    fun getFullname(): String? {
        return fullname
    }

    fun setFullname(fullname: String) {
        this.fullname = fullname
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getDeviceID(): String? {
        return deviceID
    }

    fun setDeviceID(deviceID: String) {
        this.deviceID = deviceID
    }

    fun getOTP(): String? {
        return oTP
    }

    fun setOTP(oTP: String) {
        this.oTP = oTP
    }

    fun getRegistrationDate(): String? {
        return registrationDate
    }

    fun setRegistrationDate(registrationDate: String) {
        this.registrationDate = registrationDate
    }

    fun getIsLogin(): Boolean? {
        return isLogin
    }

    fun setIsLogin(isLogin: Boolean?) {
        this.isLogin = isLogin
    }

    fun getOTPCount(): Int? {
        return oTPCount
    }

    fun setOTPCount(oTPCount: Int?) {
        this.oTPCount = oTPCount
    }

    fun getLastLogin(): String? {
        return lastLogin
    }

    fun setLastLogin(lastLogin: String) {
        this.lastLogin = lastLogin
    }


}