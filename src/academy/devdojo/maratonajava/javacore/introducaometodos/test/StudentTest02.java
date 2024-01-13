package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Student;
import academy.devdojo.maratonajava.javacore.introducaometodos.domain.StudentController;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Kakashi Hatake";
        student01.age = 27;
        student01.gender = 'M';

        student02.name = "Killer B";
        student02.age = 35;
        student02.gender = 'M';

        student01.print();
        student02.print();
    }
}
