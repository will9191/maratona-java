package academy.devdojo.maratonajava.introducao;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 months
        // 31,29,29,30,31 days

        int [][] days = new int[3][3];

        days[0][0] = 31;
        days[0][1] = 29;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 29;
        days[1][2] = 31;

        days[2][0] = 31;
        days[2][1] = 29;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

    }
}
