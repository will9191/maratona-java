package academy.devdojo.maratonajava.javacore.modificadorfinal.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();


    public final void print (){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
