package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print () {
        System.out.println("----------");
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.age);
    }
}

