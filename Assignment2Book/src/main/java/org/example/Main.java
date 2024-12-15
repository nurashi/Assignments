package org.example;

import org.example.model.Person;
import org.example.model.Professor;
import org.example.model.Staff;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {
        Person pers = new Student("Nurasyl Orazbek", 17, 1, "Software Engineering");
        System.out.println(pers.displayInfo());
        pers = new Professor("Askar Khaimuldin", 25, 2, "Department of Computer Engeneering");
        System.out.println(pers.displayInfo());

        pers = new Staff("Somebody", 30, 3, "AITU");
        System.out.println(pers.displayInfo());


    }
}