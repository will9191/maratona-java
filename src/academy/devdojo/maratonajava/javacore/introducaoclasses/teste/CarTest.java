package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.name = "Ford Mustang Shelby";
        car.model = "GT500";
        car.year = 1967;

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);
    }
}
