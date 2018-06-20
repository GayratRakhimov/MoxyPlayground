package com.gayratrakhimov.moxyplayground.base

import com.arellomobile.mvp.MvpPresenter
import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenter<V : BaseView> : MvpPresenter<V>() {

    protected var mCompositeDisposable = CompositeDisposable()

    fun disposeAll() {
        mCompositeDisposable.clear()
    }

}