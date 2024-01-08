package academy.devdojo.maratonajava.introducao;

public class RepeatingStructures05 {
    public static void main(String[] args) {
        double carValue = 50000;


        for (int installment = (int) carValue; installment >= 1; installment--) {
            double installmentValue = carValue / installment;

            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("Installment " + installment + " R$" + installmentValue);
        }
    }
}
