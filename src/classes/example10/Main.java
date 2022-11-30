package classes.example10;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("lada", 100_000, 3);
        Car car3 = new Car();

        System.out.println(Car.numbersOfCars);

        Car.showInfo("Привет");

    }

    private Car updateCar(Car car) {

        car.setAge(2);
        car.setPrice(1_000_000);
        return car;
    }

}

