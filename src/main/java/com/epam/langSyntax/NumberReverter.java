package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder builder = new StringBuilder(String.valueOf(number));
        System.out.println(builder.reverse());
    }

}
