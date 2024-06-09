package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (i * numberTableToPrint));
        }
    }

}
