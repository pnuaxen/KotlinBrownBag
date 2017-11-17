package com.peoplenet.driverworkerapplet

/**
 * Created by uaxen on 11/17/2017.
 */
class Model {
    var counter : Int = 0

    fun incrementCounter () : Int {
        counter++
        return counter
    }
   // fun incrementCounter() = ++counter
}