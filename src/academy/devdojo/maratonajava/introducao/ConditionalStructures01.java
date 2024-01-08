package academy.devdojo.maratonajava.introducao;

public class ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 18;

        boolean isAllowedToDrink = age >= 18;

        if (isAllowedToDrink) {
            System.out.println("Allowed to drink");
        } else {
            System.out.println("Not allowed to drink");
        }

    }
}
