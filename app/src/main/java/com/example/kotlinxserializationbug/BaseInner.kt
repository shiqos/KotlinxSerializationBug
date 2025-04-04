package com.example.kotlinxserializationbug

import kotlinx.serialization.Serializable

@Serializable
open class BaseInner(
    val data: Int? = null,
//    val data1: Int? = null, // TODO: 1. Uncomment and run app:assembleDebug, check ChildInner$$serializer cinit
//    val data2: Int? = null, // TODO: 2. Uncomment and run app:assembleDebug, check ChildInner$$serializer cinit
//    val data3: Int? = null, // TODO: 3. Uncomment and run app:assembleDebug, check ChildInner$$serializer cinit
)