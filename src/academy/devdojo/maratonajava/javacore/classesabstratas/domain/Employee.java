package academy.devdojo.maratonajava.javacore.classesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonusCalc();
    }

    public abstract void bonusCalc();
}
