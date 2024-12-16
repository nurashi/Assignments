package org.example;
import org.example.model.FullTimeEmployee;
import org.example.model.PartTimeEmployee;
import org.example.model.Intern;
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Somebody", 30, 1000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Somebody1", 25, 200, 4);
        Intern intern = new Intern("Nurasyl", 17, 90.85);

        fullTimeEmp.work();
        fullTimeEmp.displayInfo();

        partTimeEmp.work();
        partTimeEmp.displayInfo();

        intern.work();
        intern.displayInfo();
    }
}