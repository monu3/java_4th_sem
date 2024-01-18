package com.texas.fourthsem.array.studentprogram;

import java.io.IOException;

/**
 * @Author StudentMainProgram
 * java-suraj -- 2024-01-10
 */
public class StudentMainProgram {
    public static void main(String[] args) throws IOException {
        StudentIO studentIO = new StudentIO();
        ResultCalculator resultCalculator = new ResultCalculator();

        // READ STUDENT
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = studentIO.readStudent();
        }
        // STUDENT RESULT CALCULATOR
        for (int i = 0; i < students.length; i++) {
            //students[i] = studentIO.readStudent();
            studentIO.displayStudent(students[i]);
            boolean isPassed = resultCalculator.isStudentPassed(students[i]);
            if (isPassed) {
                studentIO.show("Congratulations !!! ");
            } else {
                Integer[] failedIndex = resultCalculator.findFailedIndex(students[i].getMarks());
                for (int j = 0; j < failedIndex.length; j++) {
                    if (failedIndex[j] != null)
                        studentIO.show("Failed in " + (failedIndex[j] + 1) + " Subject");
                }
            }
        }
    }
}
