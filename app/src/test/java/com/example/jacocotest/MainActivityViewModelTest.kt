package com.example.jacocotest

import com.example.jacocotest.viewmodel.MainActivityViewModel
import org.junit.Assert.assertEquals
import org.junit.Test


class MainActivityViewModelTest {

    @Test
    fun plus_2_2() {
        assertEquals(4, MainActivityViewModel.plus(2, 2))
    }

    @Test
    fun plus_2_minus_1() {
        assertEquals(1, MainActivityViewModel.plus(2, -1))
    }

    @Test
    fun multiple_2_3() {
        assertEquals(6, MainActivityViewModel.multiple(2, 3))

    }

    @Test
    fun multiple_2_0() {
        assertEquals(0, MainActivityViewModel.multiple(2, 0))

    }
}