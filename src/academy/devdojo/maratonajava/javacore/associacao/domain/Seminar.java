package academy.devdojo.maratonajava.javacore.associacao.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Location location;
    private Teacher teacher;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location = location;
    }

    public void print() {
        System.out.println("--- Seminar ---");
        System.out.println("Title: " + this.title);
        System.out.println("Location: " + this.location.getAddress());
        if (students != null) {
            for (Student student : students) {
                System.out.println("Student: "+ student.getName());
            }
        } else {
            System.out.println("No students found");
        }
        System.out.println("Teacher: " + this.teacher.getName());
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
