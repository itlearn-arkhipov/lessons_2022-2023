package string;

public class Test6 {
    public static void main(String[] args) {
        // Определение позиции элемента в строке

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(alphabet.indexOf('C')); // 2
        System.out.println(alphabet.indexOf('D')); // 3
        System.out.println(alphabet.indexOf('P')); // 15

        System.out.println(alphabet.indexOf('Я')); // -1

    }
}

