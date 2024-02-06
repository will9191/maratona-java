package academy.devdojo.maratonajava.javacore.interfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading database data");
    }

    @Override
    public void remove() {
        System.out.println("Removing from database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on Data");
    }

    public static void retrieveMaxDataSize () {
        System.out.println("Inside retrieveMaxDataSize in Data Class");
    }
}
