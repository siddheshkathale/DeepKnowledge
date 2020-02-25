package com.deepknowledge.model

import com.deepknowledge.model.AuthenticationModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class CommonResponse {

    @SerializedName("Message")
    @Expose
    private var message: String? = null
    @SerializedName("IsError")
    @Expose
    private var isError: Boolean? = null
    @SerializedName("_CourseList")
    @Expose
    private var courseList: Any? = null
    @SerializedName("_EventList")
    @Expose
    private var eventList: Any? = null
    @SerializedName("_BookList")
    @Expose
    private var bookList: Any? = null
    @SerializedName("_AuthenticationModel")
    @Expose
    private var authenticationModel: AuthenticationModel? = null
    @SerializedName("Flag")
    @Expose
    private var flag: Int? = null

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getIsError(): Boolean? {
        return isError
    }

    fun setIsError(isError: Boolean?) {
        this.isError = isError
    }

    fun getCourseList(): Any? {
        return courseList
    }

    fun setCourseList(courseList: Any) {
        this.courseList = courseList
    }

    fun getEventList(): Any? {
        return eventList
    }

    fun setEventList(eventList: Any) {
        this.eventList = eventList
    }

    fun getBookList(): Any? {
        return bookList
    }

    fun setBookList(bookList: Any) {
        this.bookList = bookList
    }

    fun getAuthenticationModel(): AuthenticationModel? {
        return authenticationModel
    }

    fun setAuthenticationModel(authenticationModel: AuthenticationModel) {
        this.authenticationModel = authenticationModel
    }

    fun getFlag(): Int? {
        return flag
    }

    fun setFlag(flag: Int?) {
        this.flag = flag
    }
}