package com.yaabelozerov.qiwi_stock.data.network

import retrofit2.http.GET

interface ComtradeAPI {
    @GET("/C/A/HS?period=&reporterCode=&partnerCode=0&flowCode=x&cmdCode=total&customsCode=c00&motCode=0&partner2Code=0&undefinednone=&breakdownMode=plus&includeDesc=True&countOnlyFalse=")
    fun getData()
}