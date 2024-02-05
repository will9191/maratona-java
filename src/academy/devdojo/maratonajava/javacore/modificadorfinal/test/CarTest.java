package academy.devdojo.maratonajava.javacore.modificadorfinal.test;

import academy.devdojo.maratonajava.javacore.modificadorfinal.domain.Buyer;
import academy.devdojo.maratonajava.javacore.modificadorfinal.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        Buyer buyer2 = new Buyer();

        car.BUYER.setName("Comprador");

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
    }
}
