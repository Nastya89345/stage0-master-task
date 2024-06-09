package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = isLeap(year) ? 29 : 28;
                break;
            default:
                System.out.println("invalid date");
        }
        if (days > 0) {
            System.out.println(days);
        }

    }

    private boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

}
