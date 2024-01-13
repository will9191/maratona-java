package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.multiplication(7, 25);
        double result = calculator.division(5, 3);
        System.out.println(result);
        calculator.division2(2, 0);
        int num1 = 2;
        int num2 = 3;
        calculator.modify(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        int[] numbers = {1, 2, 3, 4, 5};
        calculator.sumArray(numbers);

        calculator.sumVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
