package com.example.module1.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Test


class ModuleViewModelTest {

    @Test
    fun plus_2_2() {
        assertEquals(4, ModuleViewModel.plus(2, 2))
    }

    @Test
    fun plus_2_minus_1() {
        assertEquals(1, ModuleViewModel.plus(2, -1))
    }

    @Test
    fun multiple_2_3() {
        assertEquals(6, ModuleViewModel.multiple(2, 3))

    }

    @Test
    fun multiple_2_0() {
        assertEquals(0, ModuleViewModel.multiple(2, 0))

    }
}