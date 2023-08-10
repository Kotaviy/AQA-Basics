package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {
    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainWithCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
}
