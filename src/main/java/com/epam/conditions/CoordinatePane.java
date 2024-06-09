package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String answer;
        if(x > 0 && y > 0){
            answer = "first";
        }else if (x < 0 && y > 0){
            answer = "second";
        }else if(x < 0 && y < 0){
            answer = "third";
        }else if(x > 0 && y < 0){
            answer = "fourth";
        }else{
            answer = "zero";
        }
        System.out.println(answer);
    }

}

