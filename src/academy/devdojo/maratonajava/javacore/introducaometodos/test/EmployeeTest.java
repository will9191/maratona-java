package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Monkey D. Luffy";
        employee.age = 18;
        employee.salaries = new double[] {7500, 5000, 2000};
        employee.getData();
    }

}
