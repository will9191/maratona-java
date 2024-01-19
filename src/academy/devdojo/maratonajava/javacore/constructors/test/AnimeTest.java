package academy.devdojo.maratonajava.javacore.constructors.test;

import academy.devdojo.maratonajava.javacore.constructors.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "TV", 24, "Shounen", "Mappa");
        anime.print();
    }
}
