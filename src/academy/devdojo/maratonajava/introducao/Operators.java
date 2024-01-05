package academy.devdojo.maratonajava.introducao;

public class Operators {
    public static void main(String[] args) {
        // (arithmetic operators)
        // + - / *
        int num1 = 25;
        double num2 = 12;
        double result = (short) (num1 / num2) ; // casting

        System.out.println(result);

        // %
        int resto = 35 % 7;

        if(resto == 0) {
            System.out.println("Divisível");
        } else {
            System.out.println("Não divisível");
        }

        // (relational operators)
        // < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println("isTenBiggerThanTwenty" + isTenBiggerThanTwenty);

        // (logical operators)
        // && (and) || (or) ! (not)

        int age = 18;
        float salary = 4500F;
        boolean isInTheLaw = age >= 16 && salary >= 4600;

        double checkingAccountTotalValue = 200;
        double savingsAccountTotalValue = 10000;
        float playstationValue = 5000F;
        boolean isPlaystationFivePurchasable = checkingAccountTotalValue >= playstationValue || savingsAccountTotalValue >= playstationValue;
        System.out.println(isPlaystationFivePurchasable);

        // (assignment operators)
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 2000;
        bonus *= 3;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
    }
}
