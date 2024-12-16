package org.example.model;

public class FullTimeEmployee extends Person implements Employee {
    private double salary;
    public FullTimeEmployee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.print("Full Time employee working - ");
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println(getName() + " " + getAge() + " " + calculateSalary());;
    }

}
