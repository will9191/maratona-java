package academy.devdojo.maratonajava.javacore.associacao.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;


    public void print () {
        System.out.println("--- Student ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if (seminar != null) {
            System.out.println("Seminar: " + seminar.getTitle());
        }
        System.out.println();
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName () {
        return name;
    }
}
