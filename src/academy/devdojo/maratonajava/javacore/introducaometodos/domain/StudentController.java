package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class StudentController {
    public void getStudents (Student student) {
        System.out.println("-----------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
