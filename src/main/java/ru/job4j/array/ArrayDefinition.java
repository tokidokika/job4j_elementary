package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Рзамер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Vasya Pupkin";
        names[1] = "Fedya Kurochkin";
        names[2] = "Jane Ostin";
        names[3] = "Brandon Sanderson";
        System.out.println("Первое имя " + names[0]);
        System.out.println("2nd: " + names[1]);
        System.out.println("XVIII century writer: " + names[2]);
        System.out.println("XXI century writer: " + names[3]);
    }
}
