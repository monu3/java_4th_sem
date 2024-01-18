package com.texas.fourthsem;

/**
 * @Author Circle
 * java-suraj -- 2024-01-08
 */
public class Circle {
    private float radius;

    // data set mechanism

    // data get mechanism

    public Circle() {
        // if you need to do something when an object is created.
        System.out.println("I am creating a circle");
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void setRadius(float radius) {
        if (radius <= 0) {
            radius = 1;
        }
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
}
