package com.texas.fourthsem.array.studentprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author StudentIO
 * java-suraj -- 2024-01-10
 */
public class StudentIO {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void show(String msg) {
        System.out.println(msg);
    }

    public Student readStudent() throws IOException {
        Student student = new Student();
        show("Enter your name");
        student.setFullName(bufferedReader.readLine());
        show("Enter your email");
        student.setEmail(bufferedReader.readLine());
        show("Enter your mobile number");
        student.setMobileNumber(bufferedReader.readLine());

        // marks reading
        float[] marks = new float[5];
        show("Reading marks ... ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter " + (i + 1) + " marks");
            marks[i] = Float.parseFloat(bufferedReader.readLine());
        }
        student.setMarks(marks);
        return student;
    }


    public void displayStudent(Student student) {
        show("**********************");
        show("STUDENT NAME " + student.getFullName());
        show("STUDENT EMAIL " + student.getEmail());
        show("STUDENT MOBILE " + student.getMobileNumber());
        show("STUDENT MARKS " + Arrays.toString(student.getMarks()));
        show("**********************");
    }

}
