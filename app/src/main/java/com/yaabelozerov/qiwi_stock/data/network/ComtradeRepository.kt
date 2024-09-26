package com.yaabelozerov.qiwi_stock.data.network

import android.util.Log
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.yaabelozerov.qiwi_stock.C
import com.yaabelozerov.qiwi_stock.data.model.BaseComtradeResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ComtradeRepository {
    fun getData() {
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val r = Retrofit.Builder().baseUrl(C.ComtradeBaseUrl).addConverterFactory(MoshiConverterFactory.create(moshi)).build()
        val api = r.create(ComtradeAPI::class.java)
//
//        val ad = moshi.adapter(BaseComtradeResponse::class.java)
        val data = api.getData().enqueue(object : Callback<BaseComtradeResponse?> {
            override fun onResponse(
                p0: Call<BaseComtradeResponse?>,
                p1: Response<BaseComtradeResponse?>
            ) {
                Log.d("Response", p1.toString())
            }

            override fun onFailure(p0: Call<BaseComtradeResponse?>, p1: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}