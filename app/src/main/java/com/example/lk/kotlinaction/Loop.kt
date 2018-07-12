package com.example.lk.kotlinaction

import org.junit.Test

/**
 * Created by lk on 2018/7/12.
 */
class Loop {
    val oneToten = 1..10//声明一个数组
    @Test
    fun Divisiblezz() {
        for (i in oneToten) {
            System.out.print(Divisible(i))
        }
    }

    fun Divisible(i: Int): String {
        var message: String
        when {
            i % 15 == 0 -> message = "fizzbuzz"
            i % 3 == 0 -> message = "fizz"
            i % 5 == 0 -> message = "buzz"
            else -> message = (i.toString())
        }
        return message
    }

}