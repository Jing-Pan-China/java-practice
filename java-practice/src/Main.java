import car.audi.AudiA3;
import car.Car;
import car.fiat.Fiat500;
import constants.Color;

public class Main {
    public static void main(String[] args) {
        Car singleCar = new Fiat500(); // Can be substituted with 'new udiA3()' according to Liskov Substitution Principle (LSP).
        Car[] catalog = new Car[] { new AudiA3(), new Fiat500() };
        for (Car car : catalog) {
            System.out.println(car.getColor() + " " + car.getName());
        }
        System.out.println("Finished printing the catalog.");
    }
}
