package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){
            String str = " ".repeat(cathetusLength - i);
            str += "*".repeat(i);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
