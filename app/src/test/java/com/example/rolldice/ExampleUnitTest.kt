package com.example.rolldice

import junit.framework.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest{
    @Test
    fun generate_number(){
        val dice = MainActivity.Dice()
        val rollResult = dice.rol()
        assertTrue("Roll Dice", rollResult in 1..6)
    }
}