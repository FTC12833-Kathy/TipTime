package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {
    @Test
    fun CalculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(2)
        var actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}