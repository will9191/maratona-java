package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Jujutsu Kaisen", "TV", 24, "Shounen");

//        anime.setName("Jujutsu Kaisen");
//        anime.setType("TV");
//        anime.setEpisodes(24);
        anime.print();
    }
}
