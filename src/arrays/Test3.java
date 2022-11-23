package arrays;

public class Test3 {
    public static void main(String[] args) {

        // Создание массива с размером 8
        String[] arrayString = new String[8];

        // Присваивание значений каждому
        // элементу массива
        arrayString[0] = "Надо";
        arrayString[1] = "больше";
        arrayString[2] = "практики";
        arrayString[3] = "в";
        arrayString[4] = "програ";
        arrayString[5] = "ммирова";
        arrayString[6] = "нии";
        arrayString[7] = "!";
        // Вывод элементов массива в консоль
        for (String j : arrayString) {
            System.out.print(j);
        }
    }
}

