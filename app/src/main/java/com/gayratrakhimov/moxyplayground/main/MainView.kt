package com.gayratrakhimov.moxyplayground.main

import com.arellomobile.mvp.MvpView

interface MainView: MvpView {

    fun showIp(ip: String)

}