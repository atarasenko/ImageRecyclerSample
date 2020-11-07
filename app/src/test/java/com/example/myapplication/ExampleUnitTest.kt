package com.example.myapplication

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testArrayConversion() {
        val rnd = Random()
        val data = ByteArray(1024)
        rnd.nextBytes(data)
        print("${data[0]} ${data[1]}")
        assertEquals(DataTransform().convert(data), data.map { it.toInt() and 0xFF });
    }
}
