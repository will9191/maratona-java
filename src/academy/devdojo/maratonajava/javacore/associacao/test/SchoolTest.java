package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.School;
import academy.devdojo.maratonajava.javacore.associacao.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jiraya");
        Teacher teacher2 = new Teacher("Kakashi");
        Teacher[] teachers = new Teacher[] {teacher, teacher2};
        School school = new School("Ninja Academy", teachers);

      school.print();

    }
}
