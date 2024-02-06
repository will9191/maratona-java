package academy.devdojo.maratonajava.javacore.interfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission () {
        System.out.println("Checking permissions");
    }

    public static void retrieveMaxDataSize () {
        System.out.println("Inside retrieveMaxDataSize in interface");
    }
}
