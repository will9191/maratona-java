package academy.devdojo.maratonajava.introducao;

public class RepeatingStructures02 {
    public static void main(String[] args) {
// print all even numbers between 0 and 1000000
        for (int i = 0; i <= 1000000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
