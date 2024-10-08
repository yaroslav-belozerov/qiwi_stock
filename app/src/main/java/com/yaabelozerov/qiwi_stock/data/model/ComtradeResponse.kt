package com.yaabelozerov.qiwi_stock.data.model

import com.squareup.moshi.Json

data class BaseComtradeResponse (
    @Json(name = "elapsedTime") var elapsedTime: String? = null,
    @Json(name = "data") var data: List<ComtradeResponse>? = null
)

data class ComtradeResponse (
    @Json(name = "typeCode") var typeCode: String? = null,
    @Json(name = "freqCode") var freqCode: String? = null,
    @Json(name = "refPeriodId") var refPeriodId: Int? = null,
    @Json(name = "refYear") var refYear: Int? = null,
    @Json(name = "refMonth") var refMonth: Int? = null,
    @Json(name = "period") var period: String? = null,
    @Json(name = "reporterCode") var reporterCode: Int? = null,
    @Json(name = "reporterISO") var reporterISO: String? = null,
    @Json(name = "reporterDesc") var reporterDesc: String? = null,
    @Json(name = "flowCode") var flowCode: String? = null,
    @Json(name = "flowDesc") var flowDesc: String? = null,
    @Json(name = "partnerCode") var partnerCode: Int? = null,
    @Json(name = "partnerISO") var partnerISO: String? = null,
    @Json(name = "partnerDesc") var partnerDesc: String? = null,
    @Json(name = "partner2Code") var partner2Code: Int? = null,
    @Json(name = "partner2ISO") var partner2ISO: String? = null,
    @Json(name = "partner2Desc") var partner2Desc: String? = null,
    @Json(name = "classificationCode") var classificationCode: String? = null,
    @Json(name = "classificationSearchCode") var classificationSearchCode: String? = null,
    @Json(name = "isOriginalClassification") var isOriginalClassification: Boolean? = null,
    @Json(name = "cmdCode") var cmdCode: String? = null,
    @Json(name = "cmdDesc") var cmdDesc: String? = null,
    @Json(name = "aggrLevel") var aggrLevel: Int? = null,
    @Json(name = "isLeaf") var isLeaf: Boolean? = null,
    @Json(name = "customsCode") var customsCode: String? = null,
    @Json(name = "customsDesc") var customsDesc: String? = null,
    @Json(name = "mosCode") var mosCode: String? = null,
    @Json(name = "motCode") var motCode: Int? = null,
    @Json(name = "motDesc") var motDesc: String? = null,
    @Json(name = "qtyUnitCode") var qtyUnitCode: Int? = null,
    @Json(name = "qtyUnitAbbr") var qtyUnitAbbr: String? = null,
    @Json(name = "qty") var qty: Int? = null,
    @Json(name = "isQtyEstimated") var isQtyEstimated: Boolean? = null,
    @Json(name = "altQtyUnitCode") var altQtyUnitCode: Int? = null,
    @Json(name = "altQtyUnitAbbr") var altQtyUnitAbbr: String? = null,
    @Json(name = "altQty") var altQty: Int? = null,
    @Json(name = "isAltQtyEstimated") var isAltQtyEstimated: Boolean? = null,
    @Json(name = "netWgt") var netWgt: String? = null,
    @Json(name = "isNetWgtEstimated") var isNetWgtEstimated: Boolean? = null,
    @Json(name = "grossWgt") var grossWgt: String? = null,
    @Json(name = "isGrossWgtEstimated") var isGrossWgtEstimated: Boolean? = null,
    @Json(name = "cifvalue") var cifvalue: String? = null,
    @Json(name = "fobvalue") var fobvalue: Double? = null,
    @Json(name = "primaryValue") var primaryValue: Double? = null,
    @Json(name = "legacyEstimationFlag") var legacyEstimationFlag: Int? = null,
    @Json(name = "isReported") var isReported: Boolean? = null,
    @Json(name = "isAggregate") var isAggregate: Boolean? = null
)