package academy.devdojo.maratonajava.introducao;

public class ConditionalStructures02 {
    public static void main(String[] args) {
        int age = 18;

        boolean isChildren = age < 15;
        boolean isYouth = age >= 15 && age < 18;

        String category;

        if (isChildren) {
            category = "Children's category";
        } else if (isYouth) {
            category = "Youth category";
        } else {
            category = "Adult category";
        }

        System.out.println(category);
    }
}
