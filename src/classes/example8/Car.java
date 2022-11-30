package classes.example8;

public class Car {

    private String model;
    private double price;
    private int age;

    public Car() {
    }

    public Car(String model, double price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car " + this.model;
    }

}

