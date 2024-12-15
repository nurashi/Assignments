package org.example.model;

public class Professor extends Person {
    private int professorId;
    private String department;

    public Professor(String name, int age, int professorId, String department) {
        super(name, age);
        this.professorId = professorId;
        this.department = department;
    }

    public int getProfessorId() {
        return professorId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String displayInfo() {
        return professorId + " " + super.displayInfo() + " " + department;
    }
}
