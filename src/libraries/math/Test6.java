package libraries.math;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Test6.randomInARange(0,100));
        }
        //        78
        //        5
        //        7
        //        58
        //        53
    }

    static int randomInARange(int min, int max) {
        return  (int) (Math.random() * ((max - min) + 1)) + min;
    }
}


