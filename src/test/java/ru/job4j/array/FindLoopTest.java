package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {2, 4, 1, 7};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas15ThenMinus1() {
        int[] data = {7, 3, 3, 5, 9};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = new int[] {1, 10, 3, 7, 4, 9, 6};
        int el = 9;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5ThenMinus1() {
        int[] data = new int[] {1, 10, 3, 7, 4, 9, 6};
        int el = 2;
        int start = 3;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}