package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

import java.util.Arrays;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

//    public void getData() {
//        System.out.println("-------------------");
//        System.out.println(this.name);
//        System.out.println(this.age);
//        if (salaries != null) {
//            for (double salary : salaries) {
//                System.out.println(salary + " ");
//            }
//        }
//        getAverageSalary();
//    }
//
    public void getAverageSalary() {
        System.out.println("-------");

        if (salaries != null) {
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;
        }
        System.out.println("Average of " + average);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
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
