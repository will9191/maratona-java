package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Monkey D. Luffy");
        employee.setAge(18);
        employee.setSalaries(new double[] {7500, 5000, 2000});

    }

}
