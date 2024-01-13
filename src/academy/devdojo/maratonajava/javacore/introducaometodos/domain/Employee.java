package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

import java.util.Arrays;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void getData() {
        System.out.println("-------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries != null) {
            for (double salary : salaries) {
                System.out.println(salary + " ");
            }
        }
        getAverageSalary();
    }

    public void getAverageSalary() {
        System.out.println("-------");
        double average = 0;
        if (salaries != null) {
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;
        }
        System.out.println("Average of " + average);

    }

//    public void getAverageSalary() {
//   if (salaries == null) {
//   return;
//  }
//        System.out.println("-------");
//        double average = 0;
//
//            for (double salary : salaries) {
//                average += salary;
//            }
//            average /= salaries.length;
//
//        System.out.println("Average of " + average);
//
//    }
}
