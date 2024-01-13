package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Student;
import academy.devdojo.maratonajava.javacore.introducaometodos.domain.StudentController;

public class StudentTest {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Kakashi Hatake";
        student01.age = 27;
        student01.gender = 'M';

        student02.name = "Killer B";
        student02.age = 35;
        student02.gender = 'M';

        studentController.getStudents(student01);
        studentController.getStudents(student02);
    }
}
