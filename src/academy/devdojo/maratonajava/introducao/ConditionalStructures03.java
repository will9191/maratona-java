package academy.devdojo.maratonajava.introducao;

public class ConditionalStructures03 {
    public static void main(String[] args) {
        double salary = 6001;
        String msgDonate = "Im gonna give 500 to DevDojo";
        String msgDontDonate = "I cannot do that yet";

        // ternary operator
        // (condition) ? true : false
        String result = salary > 5000 ? msgDonate : msgDontDonate;

        System.out.println(result);
    }
}
