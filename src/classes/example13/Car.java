package classes.example13;

public class Car {


    private String model;
    private int age;

    public Car(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public class HandleBar {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево!");
        }
    }

}

