package string;

public class Test8 {
    public static void main(String[] args) {
//        Перевод строки в верхний/нижний регистр:

        String name = "Иван Иванович Иванов";

        String lowerCaseName = name.toLowerCase();
        String upperCaseName = name.toUpperCase();

        System.out.println(lowerCaseName); // иван иванович иванов
        System.out.println(upperCaseName); // ИВАН ИВАНОВИЧ ИВАНОВ
    }
}

