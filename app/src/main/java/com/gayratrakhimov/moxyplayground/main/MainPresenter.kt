package com.gayratrakhimov.moxyplayground.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.gayratrakhimov.moxyplayground.api.Api
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(): MvpPresenter<MainView>() {

    @Inject
    lateinit var api: Api

//    override fun onFirstViewAttach() {
//        Injector.appComponent.inject(this)
//    }

    fun getIp() {
        api.getIp()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    viewState.showIp(it.ip)
                }, {

                })

    }

}
