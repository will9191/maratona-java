package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Calculator {
    public void sum() {
        System.out.println(10 + 10);
    }

    public void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public void division2(double num1, double num2) {
        if (num2 == 0) {
           System.out.println("Não divisível");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void modify (int num1, int num2) {
        num1 = 213;
        num2 = 312;
        System.out.println(num1);
        System.out.println(num2);
    }

    public void sumArray (int[] numbers) {
        int sum = 0;
        for(int num: numbers) {
            sum += 1;
        }
        System.out.println(sum);
    }

    public void sumVarArgs (int... numbers) {
        int sum = 0;
        for(int num: numbers) {
            sum += 1;
        }
        System.out.println(sum);
    }
}
