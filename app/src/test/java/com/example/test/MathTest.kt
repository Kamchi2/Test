package com.example.test

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }
    // add
    @Test
    fun simpleAddCase() {
        assertEquals("4", math?.add("1", "3"))
    }

    @Test
    fun spaceAddCase() {
        assertEquals("Символы вводить нельзя", math?.add("1 ", " 3"))
    }

    @Test
    fun letterAddCase() {
        assertEquals("Символы вводить нельзя", math?.add("1", "asd"))
    }

    @Test
    fun symbolAddCase() {
        assertEquals("Символы вводить нельзя", math?.add("34%#@@#%)*$35$", "2"))
    }

    @Test
    fun doubleAddCase() {
        assertEquals("Символы вводить нельзя", math?.add("2.3", "2.1"))
    }
    // devide

    @Test
    fun simpleDevideCase() {
        assertEquals("5", math?.devide("15", "3"))
    }

    @Test
    fun spaceDevideCase() {
        assertEquals("Символы вводить нельзя", math?.devide("65 ", " 5"))
    }

    @Test
    fun letterDevideCase() {
        assertEquals("Символы вводить нельзя", math?.devide("1", "7asd"))
    }

    @Test
    fun symbolDevideCase() {
        assertEquals("Символы вводить нельзя", math?.devide("30%#@@#%)*$35$", "10"))
    }

    @Test
    fun doubleDevideCase() {
        assertEquals("Символы вводить нельзя", math?.devide("25.5", "5"))
    }

    @After
    fun detach() {
        math = null
    }
}