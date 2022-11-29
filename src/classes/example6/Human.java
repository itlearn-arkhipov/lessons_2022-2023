package classes.example6;

public class Human {
    String name;
    String surname;
    int age;

    public Human() {
    }

    public Human(String surname) {
        this.surname = surname;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}


