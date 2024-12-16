package org.example.model;

public class Intern extends Person implements Employee{
    private double stipend;

    public Intern(String name, int age, double stipend) {
        super(name, age);
        this.stipend = stipend;
    }


    @Override
    public void work() {
        System.out.print("Intern working - ");
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + " " + getAge() + " " + calculateSalary());
    }
}
