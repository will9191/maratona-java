package academy.devdojo.maratonajava.javacore.associacao.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;


    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this(name);
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this(name, specialty);
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("--- Teacher ---");
        System.out.println("Name: " + this.name);
        System.out.println("Specialty: " + this.specialty);
        if (seminars != null){
        for (Seminar seminar : seminars) {
            System.out.println("Seminar: " + seminar.getTitle());
        }} else{
            System.out.println("No seminars found");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
