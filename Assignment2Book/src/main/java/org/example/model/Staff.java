package org.example.model;

public class Staff extends Person {
    private int staffId;
    private String role;

    public Staff(String name, int age, int staffId, String role) {
        super(name, age);
        this.staffId = staffId;
        this.role = role;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String displayInfo() {
        return staffId + " " + super.displayInfo() + " " + role;
    }
}
