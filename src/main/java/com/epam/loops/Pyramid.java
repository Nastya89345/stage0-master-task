package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String str = " ".repeat(cathetusLength - i);
            for (int j = i; j > 0; j--) {
                str += j;
            }
            for (int j = 2; j <= i; j++) {
                str += j;
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
