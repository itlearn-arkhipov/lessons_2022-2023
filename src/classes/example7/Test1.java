package classes.example7;

public class Test1 {

    public static void main(String[] args) {

        Car lada = new Car();

        lada.setName("vesta");
        System.out.println(lada.getName());

        Car bmw = new Car("x5");
        System.out.println(bmw.getName());

    }

}
