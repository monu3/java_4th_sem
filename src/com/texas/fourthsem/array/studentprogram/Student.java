package com.texas.fourthsem.array.studentprogram;

/**
 * @Author Student
 * java-suraj -- 2024-01-10
 */
public class Student {
    private String fullName;
    private String email;
    private String mobileNumber;
    private float marks[] = new float[5];

    public Student() {
    }

    public Student(String fullName, String email, String mobileNumber, float[] marks) {
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.marks = marks;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }
}
