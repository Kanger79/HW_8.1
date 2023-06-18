package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
        System.out.println("Before cashback is " + actual);
    }

    @Test
    public void testRemainEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
        System.out.println("Before cashback is " + actual);
    }

    @Test
    public void testRemainMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 2850;
        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(actual, expected);
        System.out.println("Before cashback is " + actual);
    }
}