package academy.devdojo.maratonajava.introducao;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {
        // 1,2,3,4,5 months
        // 31,29,29,30,31 days

        int [][] arrayInt = new int[2][];

        arrayInt[0] = new int[2];

        for(int[] arrBase: arrayInt){
            for (int num: arrBase) {
                System.out.println(num);
            }
        }


    }
}