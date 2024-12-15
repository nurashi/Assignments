package org.example.model;

public class Student extends Person {
    private int studentId;
    private String major;



    public Student(String name, int age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String displayInfo() {
        return studentId + " " + super.displayInfo() + " " + major;
    }
}
