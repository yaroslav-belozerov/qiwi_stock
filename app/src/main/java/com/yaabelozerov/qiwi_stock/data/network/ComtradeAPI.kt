package com.yaabelozerov.qiwi_stock.data.network

import com.yaabelozerov.qiwi_stock.data.model.BaseComtradeResponse
import com.yaabelozerov.qiwi_stock.data.model.ComtradeResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ComtradeAPI {
    @GET("/public/v1/preview/C/A/HS?period=&reporterCode=&partnerCode=0&flowCode=x&cmdCode=total&customsCode=c00&motCode=0&partner2Code=0&undefinednone=&breakdownMode=plus&includeDesc=True&countOnlyFalse=")
    fun getData(): Call<BaseComtradeResponse>
}