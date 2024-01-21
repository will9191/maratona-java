package academy.devdojo.maratonajava.javacore.blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", new int[]{1,2,3,4,5,6});
        System.out.println(anime.getName());
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
