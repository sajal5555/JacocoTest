package com.example.module1.viewmodel;

import junit.framework.TestCase;

public class JavaModuleViewModelTest extends TestCase {
    JavaModuleViewModel javaModuleViewModel=new JavaModuleViewModel();

    public void testPlusJava_2_2() {
        assertEquals(4, javaModuleViewModel.plusJava(2, 2));
    }

    public void testPlusJava_2_minus_1() {
        assertEquals(1, javaModuleViewModel.plusJava(2, -1));
    }

    public void testMultiplyJava_2_3() {
        assertEquals(6, javaModuleViewModel.multiplyJava(2, 3));

    }

    public void testMultiplyJava_2_0() {
        assertEquals(0, javaModuleViewModel.multiplyJava(2, 0));

    }
}