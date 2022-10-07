package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    private fun type(et: Int, text: String) {
        onView(withId(et)).perform(ViewActions.typeText(text))
    }
    private fun click(et: Int) {
        onView(withId(et)).perform(ViewActions.click())
    }

    // add

    @Test
    fun simpleAdd() {
        type(R.id.firstNumber_et, "2")
        type(R.id.secondNumber_et, "6")
        click(R.id.calculatePlusBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("8")))
    }
    @Test
    fun spaceAdd() {
        type(R.id.firstNumber_et, "2 ")
        type(R.id.secondNumber_et, "  6")
        click(R.id.calculatePlusBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("8")))
    }
    @Test
    fun letterAdd() {
        type(R.id.firstNumber_et, "gfdgd2")
        type(R.id.secondNumber_et, "6dfgd")
        click(R.id.calculatePlusBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Символы вводить нельзя")))
    }
    @Test
    fun symbolAdd() {
        type(R.id.firstNumber_et, "2&%*(^*#^%@$@$%")
        type(R.id.secondNumber_et, "6%")
        click(R.id.calculatePlusBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Символы вводить нельзя")))
    }
    @Test
    fun doubleAdd() {
        type(R.id.firstNumber_et, "2.5")
        type(R.id.secondNumber_et, "6.43")
        click(R.id.calculatePlusBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Дробные числа вводить нельзя")))
    }

    //devide

    @Test
    fun simpleDevide() {
        type(R.id.firstNumber_et, "9")
        type(R.id.secondNumber_et, "3")
        click(R.id.calculateDevideBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("3")))
    }
    @Test
    fun spaceDevide() {
        type(R.id.firstNumber_et, "8 ")
        type(R.id.secondNumber_et, "  2")
        click(R.id.calculateDevideBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("4")))
    }
    @Test
    fun letterDevide() {
        type(R.id.firstNumber_et, "gfdgd2")
        type(R.id.secondNumber_et, "6dfgd")
        click(R.id.calculateDevideBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Символы вводить нельзя")))
    }
    @Test
    fun symbolDevide() {
        type(R.id.firstNumber_et, "2&%*(^*#^%@$@$%")
        type(R.id.secondNumber_et, "6%")
        click(R.id.calculateDevideBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Символы вводить нельзя")))
    }
    @Test
    fun doubleDevide() {
        type(R.id.firstNumber_et, "2.5")
        type(R.id.secondNumber_et, "6.43")
        click(R.id.calculateDevideBtn)
        onView(withId(R.id.result_tv)).check(ViewAssertions.matches(ViewMatchers.withText("Дробные числа вводить нельзя")))
    }
}