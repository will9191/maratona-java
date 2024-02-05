package academy.devdojo.maratonajava.javacore.classesabstratas.domain;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }



    @Override
    public void bonusCalc() {
        this.salary = this.salary + this.salary * 0.05;
    }
    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
