package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
        System.out.println("Before cashback is " + actual);
    }

    @Test
    public void testRemainEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
        System.out.println("Before cashback is " + actual);
    }

    @Test
    public void testRemainMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 2850;
        int actual = service.remain(amount);
        int expected = 150;

        assertEquals(expected, actual);
        System.out.println("Before cashback is " + actual);
    }
}