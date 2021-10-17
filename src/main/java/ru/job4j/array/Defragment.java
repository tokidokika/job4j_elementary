package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        int fin = i;
                        SwitchArray.swapString(array, point, fin);
                        break;
                    }
                }
            }
        }
        return array;
    }
}
