package com.peoplenet.driverworkerapplet

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun increment_isCorrect() {
        val m = Model()
        val a = m.counter
        val b = m.incrementCounter()
        val c = m.counter
        assertEquals(a+1, b)
        assertEquals(a+1, c)
    }
}
