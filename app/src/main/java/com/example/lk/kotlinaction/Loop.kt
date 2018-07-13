package com.example.lk.kotlinaction

import android.support.annotation.IntegerRes
import org.junit.Test
import java.util.*

/**
 * Created by lk on 2018/7/12.
 */
class Loop {


    /**
     * for循环
     */
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

    /**
     * 迭代map
     */
    var binaryMap = TreeMap<Char, String>()

    @Test
    fun iterateMap() {

        for (c in 'A'..'F') {
            var binady = Integer.toBinaryString(c.toInt())
            binaryMap[c] = binady
//            binaryMap.put(c,binady)
        }

        for ((letter, binary) in binaryMap) {
            print("$letter=$binary\r\n")
        }

    }

    /**
     * 集合使用下标
     */
    val IndexArray = arrayListOf("a", "b", "c")

    @Test
    fun indexFor() {
        for ((index, value) in IndexArray.withIndex()) {
            print("$index=$value\r\n")
        }
    }


    /**
     * in  运算符
     */
    @Test
    fun testIn(){
        print(isChar('a'))
        print(isInt(11))
    }

    fun isChar(c: Char) = c in 'a'..'z' || c in 'A'..'z'
    fun isInt(c: Int) = c in 1..10
}