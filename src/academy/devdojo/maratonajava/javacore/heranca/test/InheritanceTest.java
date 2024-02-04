package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.domain.Address;
import academy.devdojo.maratonajava.javacore.heranca.domain.Employee;
import academy.devdojo.maratonajava.javacore.heranca.domain.Person;

public class InheritanceTest {
    public static void main(String[] args) {
        Address address = new Address();

        address.setStreet("Rua 3");
        address.setCep("12312-345");
        Person person = new Person("Toji");
        person.setCpf("123.456.789.00");
        person.setAddress(address);
        person.print();

        Employee employee = new Employee("Willian");
        employee.setCpf("000.000.000-00");
        employee.setAddress(address);
        employee.setSalary(5000000);

        employee.print();
    }
}
