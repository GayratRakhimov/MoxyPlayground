package com.gayratrakhimov.moxyplayground

import android.app.Activity
import android.content.Context
import com.ipakyulibank.mobile.di.AppComponent
import com.ipakyulibank.mobile.di.DaggerAppComponent

object Injector {

    lateinit var appComponent: AppComponent

    fun init(context: Context){

        if(context is Activity){
            throw IllegalStateException("pass an Application as an argument to avoid memory leaks")
        }

        appComponent = DaggerAppComponent.builder()
                .build()

    }

}