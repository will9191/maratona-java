package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Player;
import academy.devdojo.maratonajava.javacore.associacao.domain.Team;

public class TeamTest {
    public static void main(String[] args) {
        Player player = new Player("Jude Bellingham");
        Player player2 = new Player("Vini Jr");

        Player[] players = {player, player2};

        Team team = new Team("Real Madrid");

        player2.setTeam(team);
        player.setTeam(team);
        team.setPlayers(players);


        player.print();
        player2.print();


        team.print();
    }
}
