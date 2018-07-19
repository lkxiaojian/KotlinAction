package com.example.lk.kotlinaction

import android.os.Build.VERSION_CODES.O
/**
 * Created by lk on 2018/7/18.
 */
class CountingSet<T>(val inserSet: MutableCollection<T>) : MutableCollection<T> by inserSet {

    var objectsAdded = O
    override fun contains(element: T): Boolean {
        objectsAdded++
        return inserSet.add(element)
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return inserSet.addAll(elements)
    }
}

