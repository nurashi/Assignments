package org.example.model;

public class PartTimeEmployee extends Person implements Employee{
    private double hourlyRate;
    private double hoursWorked;


    public PartTimeEmployee(String name, int age, double hourlyRate, double hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void work() {
        System.out.print("Part Time employee working - ");
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayInfo() {
        System.out.println(getName() + " " + getAge() + " " + calculateSalary());
    }
}
