package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The great software of future prediction");
        System.out.println("Ask your question and I will answer yes or no");

        String question = input.nextLine();

        if (question.charAt(0) == ' ') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
