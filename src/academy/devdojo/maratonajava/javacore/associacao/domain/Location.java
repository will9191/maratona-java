package academy.devdojo.maratonajava.javacore.associacao.domain;

public class Location {
    private String address;
    public Location (String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("--- Location ---");
        System.out.println(this.address);
        System.out.println();
    }

    public String getAddress () {
        return address;
    }

}
