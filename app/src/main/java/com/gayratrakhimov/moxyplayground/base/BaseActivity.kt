package com.gayratrakhimov.moxyplayground.base

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity

abstract class BaseActivity : MvpAppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }

    abstract fun getLayout(): Int

}