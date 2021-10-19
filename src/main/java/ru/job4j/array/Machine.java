package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cost = money - price;
        for (int i : coins) {
            while (cost >= i) {
                cost = cost - i;
                rsl[size] = i;
                size += 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
