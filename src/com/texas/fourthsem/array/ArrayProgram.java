package com.texas.fourthsem.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author ArrayProgram
 * java-suraj -- 2024-01-10
 */
public class ArrayProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // declaration of array
        int[] marks;

        // initialization of an array
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        marks = new int[size];

        // How to add elements to that array ?
        // 1. Using for loop
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " marks");
            marks[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(marks));

        // print or access array elements via loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("ELEMENT " + (i + 1) + " = " + marks[i]);
        }
    }
}
