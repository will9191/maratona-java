package academy.devdojo.maratonajava.javacore.interfaces.domain;

public class FileLoader  implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading database file");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database");
    }

    public static void retrieveMaxDataSize () {
        System.out.println("Inside retrieveMaxDataSize in File Class");
    }
}
