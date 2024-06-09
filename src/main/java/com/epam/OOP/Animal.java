package com.epam.OOP;


public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    private String furAnswer (){
        return this.hasFur?"a":"no";
    }
    private String pawAnswer(){
        return numberOfPaws == 1?"paw":"paws";
    }
    public String getDescription(){
        return String.format("This animal is mostly %s. It has %s %s and %s fur.", this.color, this.numberOfPaws,
                this.pawAnswer(), this.furAnswer());
    }

}
