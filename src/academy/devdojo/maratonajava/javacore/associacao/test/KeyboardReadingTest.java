package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class KeyboardReadingTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter M or F for your gender");
        char gender = input.next().charAt(0);

        System.out.println("----------");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
    }


}
