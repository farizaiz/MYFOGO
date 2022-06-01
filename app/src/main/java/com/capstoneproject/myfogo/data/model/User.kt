package com.capstoneproject.myfogo.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "userId")
    val userId: String? = "",
    @Json(name = "name")
    val name: String? = "",
    @Json(name = "token")
    val token: String? = "",
)
