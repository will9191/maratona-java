package academy.devdojo.maratonajava.introducao;

public class RepeatingStructures04 {
    public static void main(String[] args) {
        double carValue = 50000;


        for (int installment = 1; installment <= carValue; installment++) {
            double installmentValue = carValue / installment;

            if (installmentValue < 1000) {
                break;
            }
            System.out.println("Installment " + installment + " R$" + installmentValue);
        }
    }
}
