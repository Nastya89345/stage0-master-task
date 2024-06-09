package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
//        if(firstSide<=0 || secondSide <= 0 || thirdSide <= 0){
//            System.out.println("it's not a triangle");
//        } else {
            double maxSide = Math.max(firstSide, Math.max(secondSide, thirdSide));
            double sum = firstSide + secondSide + thirdSide;
            if(sum - maxSide > maxSide){
                System.out.println("this is a valid triangle");
            }else {
                System.out.println("it's not a triangle");
            }

//        }
    }

}
