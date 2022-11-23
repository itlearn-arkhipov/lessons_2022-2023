package arrays;

public class Test2 {
    public static void main(String[] args) {

        // Создание массива с размером 8
        int[] arrayInt = new int[8];

        // Присваивание значений каждому
        // элементу массива
        arrayInt[0] = 1;
        arrayInt[1] = 15;
        arrayInt[2] = 25;
        arrayInt[3] = 20;
        arrayInt[4] = 39;
        arrayInt[5] = 1000;
        arrayInt[6] = 10;
        arrayInt[7] = 7;
        // Вывод элементов массива в консоль
        for (int j : arrayInt) {
            System.out.println(j);
        }
    }
}

