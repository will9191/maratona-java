package academy.devdojo.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] names = new String[3];
        names[0] = "Satoru Gojo";
        names[1] = "Ryomen Sukuna";
        names[2] = "Yuji Itadori";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
