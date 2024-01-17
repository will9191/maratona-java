package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Itachi");
        person.setAge(22);
//        person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());


    }
}
