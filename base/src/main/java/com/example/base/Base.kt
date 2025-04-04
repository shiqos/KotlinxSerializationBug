package com.example.base

import kotlinx.serialization.Serializable

@Serializable
open class Base(
    val data: Int? = null,
    val data1: Int? = null,
    val data2: Int? = null,
)