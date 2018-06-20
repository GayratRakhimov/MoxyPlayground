package com.ipakyulibank.mobile.di

import com.gayratrakhimov.moxyplayground.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (NetworkModule::class)])
interface AppComponent {
    fun inject(mainPresenter: MainPresenter)
}