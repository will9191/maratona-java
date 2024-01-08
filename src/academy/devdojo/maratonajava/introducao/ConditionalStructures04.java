package academy.devdojo.maratonajava.introducao;

public class ConditionalStructures04 {
    public static void main(String[] args) {
        double salary = 70000;
        double tax;
        double valueToPay;

        if (salary <= 34712) {
            tax = (9.70/100);
        } else if (salary >= 34713 && salary <= 68507) {
            tax = (37.35/100);
        } else {
            tax = (49.50/100);
        }

        valueToPay = salary * tax;

        System.out.println("With the salary of $" + salary + " you should pay $" + valueToPay + " with the taxes of " + tax * 100 + "%");
    }
}
