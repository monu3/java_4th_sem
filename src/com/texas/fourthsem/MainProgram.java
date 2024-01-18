package com.texas.fourthsem;

import java.util.Scanner;

/**
 * @Author MainProgram
 * java-suraj -- 2024-01-08
 */
public class MainProgram {
    public static void main(String[] args) {
        // setting data to object via setter method
        Circle circle1 = new Circle();
        circle1.setRadius(5.5f);

        // setting data to object via constructor
        float radius1 = 1.1f;
        Circle circle2 = new Circle(radius1);
        Circle circle3 = new Circle(2.5f);
        System.out.println();


        // get the data loaded in object
        System.out.println(circle1.getRadius());
    }

}
