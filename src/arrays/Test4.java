package arrays;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        Random random = new Random();
//        twoDimArray[0][0] = 10;
//        twoDimArray[0][1] = 12;
//        twoDimArray[0][2] = -4;
//        twoDimArray[0][3] = 11;
//        twoDimArray[1][0] = 78;
//        twoDimArray[1][1] = 30;
//        twoDimArray[1][2] = 31;
//        twoDimArray[1][3] = 22;
//        twoDimArray[2][0] = 18;
//        twoDimArray[2][1] = -9;
//        twoDimArray[2][2] = 125;
//        twoDimArray[2][3] = 37;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDimArray[i][j] = random.nextInt(100);
                System.out.println(twoDimArray[i][j]);
            }
        }


    }
}
