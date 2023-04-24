package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.Callable;

public class CashbackHackServiceTest {


    @Test
    public void checkReturnValue() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkReturnValueTest2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(10);
        int expected = 990;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkReturnValueTest3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void checkReturnValueTest4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void checkReturnValueTest5() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkReturnValueTest6() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);


    }
}

