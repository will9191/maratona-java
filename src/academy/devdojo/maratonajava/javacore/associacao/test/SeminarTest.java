package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Location;
import academy.devdojo.maratonajava.javacore.associacao.domain.Seminar;
import academy.devdojo.maratonajava.javacore.associacao.domain.Student;
import academy.devdojo.maratonajava.javacore.associacao.domain.Teacher;

public class SeminarTest {
    public static void main(String[] args) {
        Location location = new Location("Luxemburgo");
        Student student = new Student("Sofia", 16);
        Student student2 = new Student("Willian", 18);


        Student[] students = {student, student2};

        Teacher teacher = new Teacher("Jiraya", "World nature");

        Seminar seminar = new Seminar("Global Warming", location);

       seminar.setStudents(students);
        seminar.setTeacher(teacher);
        seminar.print();

        student.setSeminar(seminar);
        student.print();

        student2.setSeminar(seminar);
        student2.print();

        teacher.setSeminars(new Seminar[] {seminar});
        teacher.print();

        location.print();
    }
}
