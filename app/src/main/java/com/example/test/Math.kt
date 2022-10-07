package com.example.test

class Math {

    private fun isNumeric(str: String) = str.all { it in '0' .. '9'}

    fun add(a: String, b: String): String {
        var result = ""

        if("." in a || "." in b) {
            result = "Дробные числа вводить нельзя"
        }
        else if(!isNumeric(a) || !isNumeric(b)) {
            result = "Символы вводить нельзя"
        } else {
            val num1 = a.trim().toInt()
            val num2 = b.trim().toInt()
            result = (num1 + num2).toString()
        }
        return result
    }

    fun devide(a: String, b: String): String {
        var result = ""

        if("." in a || "." in b) {
            result = "Дробные числа вводить нельзя"
        }
        else if(!isNumeric(a) || !isNumeric(b)) {
            result = "Символы вводить нельзя"
        } else if (b.toInt()<=0) {
            result = "Делитель не должен быть нулем или отрицательным числом"
        } else {
            val num1 = a.trim().toInt()
            val num2 = b.trim().toInt()
            result = (num1 / num2).toString()
        }

        return result
    }
}