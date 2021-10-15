package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = 0; i < array.length; i++) {
            if (i >= start && i <= finish) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }
}
