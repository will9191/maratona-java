package academy.devdojo.maratonajava.javacore.blocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name, int[] episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
       return episodes;
    }
}
