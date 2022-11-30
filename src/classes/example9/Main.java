package classes.example9;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("lada");

        System.out.println("до выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        Main main = new Main();
        car = main.updateCar(car);

        System.out.println("после выполнения update");
        System.out.println("model : " + car.getModel() + " , "
                + "price : " + car.getPrice() + " , "
                + "age : " + car.getAge());

        main.showInfo("Информация");

    }

    private Car updateCar(Car car) {

        car.setAge(2);
        car.setPrice(1_000_000);
        return car;
    }

    private void showInfo(String info) {
        System.out.println(info);
    }
}

