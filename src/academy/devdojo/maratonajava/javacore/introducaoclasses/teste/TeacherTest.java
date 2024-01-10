package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Koro-sensei";
        teacher.age = 1000;
        teacher.gender = 'M';
        System.out.println(teacher);
    }
}
