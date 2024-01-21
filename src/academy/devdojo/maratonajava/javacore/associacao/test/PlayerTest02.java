package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Player;
import academy.devdojo.maratonajava.javacore.associacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Vini Jr");
        Team team = new Team("Real Madrid");
        player1.setTeam(team);
        player1.print();
    }
}
