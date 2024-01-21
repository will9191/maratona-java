package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car.setSpeedLimit(200);

        Car car1 = new Car("BMW M5", 300);
        Car car2 = new Car("Toyota Supra MK4", 270);
        Car car3 = new Car("Nissan Skyline R34", 277);

        car1.print();
        car2.print();
        car3.print();
    }


}
