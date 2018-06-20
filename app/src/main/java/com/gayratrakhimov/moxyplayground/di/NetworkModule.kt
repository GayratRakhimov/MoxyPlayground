package com.ipakyulibank.mobile.di

import com.gayratrakhimov.moxyplayground.BuildConfig
import com.gayratrakhimov.moxyplayground.api.Api
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule() {

    @Provides
    fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    @Provides
    fun provideClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        var builder = OkHttpClient().newBuilder()
        if (!BuildConfig.BUILD_TYPE.contains("release")) {
            builder.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        }
        return builder.build()
    }

    @Provides
    internal fun provideGson() = Gson()

    @Provides
    internal fun provideRetrofit(client: OkHttpClient, gson: Gson) = Retrofit.Builder()
                .baseUrl("https://jsonip.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

    @Provides
    @Singleton
    internal fun provideApiService(retrofit: Retrofit): Api {
        return retrofit.create<Api>(Api::class.java!!)
    }

}