package classes.example13;

public class Main {

    public static void main(String[] args) {

        Car lada = new Car("vesta", 2);
        Car.HandleBar handleBar = lada.new HandleBar();

        lada.start();
        handleBar.left();
        handleBar.right();
    }
}

