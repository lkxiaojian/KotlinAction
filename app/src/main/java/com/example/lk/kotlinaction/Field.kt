package com.example.lk.kotlinaction

import org.junit.Test

/**
 * Created by lk on 2018/7/13.
 */
class Field {
    companion object {
        const val testName = "ZhangSan"
    }

    infix fun Any.to(other: Any) = Pair(this, other)


}