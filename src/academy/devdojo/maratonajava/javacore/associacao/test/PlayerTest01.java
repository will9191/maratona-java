package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Cristiano Ronaldo");
        Player player3 = new Player("Salah");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
