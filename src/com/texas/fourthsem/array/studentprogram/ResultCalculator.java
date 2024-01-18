package com.texas.fourthsem.array.studentprogram;

/**
 * @Author ResultCalculator
 * java-suraj -- 2024-01-10
 */
public class ResultCalculator {
    public boolean isStudentPassed(Student student) {
        float marks[] = student.getMarks();
        boolean pass = true;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                pass = false;
                break;
            }
        }
        return pass;
    }

    public Integer[] findFailedIndex(float[] marks) {
        Integer[] failedIndex = new Integer[5];
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                failedIndex[count++] = i;
            }
        }
        return failedIndex;
    }
}
