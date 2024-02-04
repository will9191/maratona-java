package academy.devdojo.maratonajava.javacore.heranca.domain;

public class Employee extends Person {
    private double salary;


    static {
        System.out.println("Inside static block of employee");
    }

    {
        System.out.println("Inside initialization block of employee 1");
    }
    {
        System.out.println("Inside initialization block of employee 2");
    }

    public Employee (String name) {
        super(name);
        System.out.println("Inside employee constructor");
    }
    public void print() {
        super.print();
        System.out.println(this.salary);
    }

    public void payment () {
        System.out.println("I " + this.name + "received the salary of " + this.salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

