package libraries.math;

public class Test1 {
    public static void main(String[] args) {
        // Метод abs - вычисление значений по модулю
        int resultInt = Math.abs(-2);
        System.out.println("resultInt = "+ resultInt);
        // 2

        double resultDouble = Math.abs(-32.8d);
        System.out.println("resultDouble = " + resultDouble);
        // 32.8

        long resultLong = Math.abs(5321L);
        System.out.println("resultLong = " + resultLong);
        // 5321

        float resultFloat = Math.abs(6.321f);
        System.out.println("resultFloat = " + resultFloat);
        // 6.321
    }
}


