package arrays;

public class Test5 {
    public static void main(String[] args) {
        // Создание трехмерного массива
        int [][][] threeDimArray = new int[2][][];

        // Создание вложенных двумерных массивов
        threeDimArray[0] = new int[2][3];
        threeDimArray[1] = new int[2][3];

        // Заполнение данными первого
        // двумерного массива
        threeDimArray[0][0][0] = 10;
        threeDimArray[0][0][1] = 12;
        threeDimArray[0][0][2] = -5;

        threeDimArray[0][1][0] = 1;
        threeDimArray[0][1][1] = 22;
        threeDimArray[0][1][2] = 134;

        // Заполнение данными второго
        // двумерного массива
        threeDimArray[1][0][0] = 10;
        threeDimArray[1][0][1] = 12;
        threeDimArray[1][0][2] = 43;

        threeDimArray[1][1][0] = 78;
        threeDimArray[1][1][1] = 30;
        threeDimArray[1][1][2] = 222;

        System.out.println(threeDimArray[1][1][2]);


//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + threeDimArray[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

    }
}

