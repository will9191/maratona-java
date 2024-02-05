package academy.devdojo.maratonajava.javacore.classesabstratas.domain;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }


    @Override
    public void bonusCalc() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
