package com.gayratrakhimov.moxyplayground.api

import io.reactivex.Single
import retrofit2.http.GET

interface Api {

    @GET("https://jsonip.com")
    fun getIp(): Single<Response>

}