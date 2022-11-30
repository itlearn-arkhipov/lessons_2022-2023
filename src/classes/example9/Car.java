package classes.example9;

public class Car {

    private String model;
    private double price;
    private int age;

    Car() {
    }

    Car(String model, double price, int age) {
        this.model = model;
        this.price = price;
        this.age = age;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}



