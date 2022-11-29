package classes.example7;

public class Car {

    private String name;
    private double price;
    private int age;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
