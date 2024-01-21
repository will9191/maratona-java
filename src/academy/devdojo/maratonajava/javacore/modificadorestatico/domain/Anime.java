package academy.devdojo.maratonajava.javacore.modificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

   static {
       System.out.println("Initialization block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Initialization block");
        episodes = new int[80];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name, int[] episodes) {
        this();
        this.name = name;
        Anime.episodes = episodes;
    }

    public Anime(String name) {
        this();
        this.name = name;
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
