package com.example.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestLeapYear {

    @Test
    public void testLeapYear_Divisible_By_4_Not_Divisible_By_100() {
        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2020));
        assertTrue(LeapYear.isLeapYear(2400));
    }

    @Test
    public void testLeapYear_Divisible_By_400() {
        assertTrue(LeapYear.isLeapYear(1600));
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void testNotLeapYear_Not_Divisible_By_4() {
        assertFalse(LeapYear.isLeapYear(2017));
        assertFalse(LeapYear.isLeapYear(2022));
    }

    @Test
    public void test_Not_LeapYear_Divisible_By_100_Not_Divisible_By_400() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
    }
}
