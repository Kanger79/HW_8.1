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

    @org.testng.annotations.Test
    public void testRemainEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
        System.out.println("Before cashback is " + actual);
    }

    @org.testng.annotations.Test
    public void testRemainMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
        System.out.println("Before cashback is " + actual);
    }
}