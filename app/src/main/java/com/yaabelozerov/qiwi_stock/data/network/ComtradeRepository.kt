package com.yaabelozerov.qiwi_stock.data.network

import android.util.Log
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.yaabelozerov.qiwi_stock.C
import com.yaabelozerov.qiwi_stock.data.model.BaseComtradeResponse
import retrofit2.Converter
import retrofit2.Retrofit

class ComtradeRepository {
    fun getData() {
        val r = Retrofit.Builder().baseUrl(C.ComtradeBaseUrl).build()
        val api = r.create(ComtradeAPI::class.java)

        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val ad = moshi.adapter(BaseComtradeResponse::class.java)
        Log.i("response", ad.fromJson(api.getData()).toString())
    }
}