package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int rsl = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialForZeroThenO() {
        int n = 0;
        int rsl = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}