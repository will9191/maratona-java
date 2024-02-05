package academy.devdojo.maratonajava.javacore.classesabstratas.test;

import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Developer;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Employee;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 10000);
        System.out.println(manager);
        Developer developer = new Developer("Willian", 500000);
        System.out.println(developer);
    }
}
