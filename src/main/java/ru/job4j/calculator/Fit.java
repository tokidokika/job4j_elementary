package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWieght(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short fheight = 160;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWieght(fheight);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 160 is " + woman);
    }
}
