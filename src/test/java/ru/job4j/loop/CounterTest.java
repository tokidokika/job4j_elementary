package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFourToElevenThenTwentyEight() {
        int start = 4;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        Assert.assertEquals(expected, result);
    }
}