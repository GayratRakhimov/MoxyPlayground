package com.gayratrakhimov.moxyplayground.main

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.gayratrakhimov.moxyplayground.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetIp.setOnClickListener({
            presenter.getIp()
        })

    }

    override fun showIp(ip: String) {
        tv_ip.text = ip
    }

}
