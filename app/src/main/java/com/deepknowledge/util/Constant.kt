package com.deepknowledge.util


import android.content.Context
import android.provider.Settings

class Constant() {

    fun getDevice(context: Context):String {
        return Settings.Secure.getString(context.getContentResolver(),
            Settings.Secure.ANDROID_ID);
    }

}