package libraries.math;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.toRadians(0)));  //0.0
        System.out.println(Math.sin(Math.toRadians(30))); // 0.49999999999999994
        System.out.println(Math.sin(Math.toRadians(90))); // 1.0

        System.out.println(Math.cos(Math.toRadians(0)));  // 1.0
        System.out.println(Math.cos(Math.toRadians(30))); // 0.8660254037844387
        System.out.println(Math.cos(Math.toRadians(90))); // 6.123233995736766E-17

        // Обратите внимание, программа вывела не просто 6.123233995736766, а 6.123233995736766E-17.
        //
        // Это представление (с «E») называется научной нотацией. В ней числа имеют вид:
        // ±mmmmE±pppp
        //
        // где:
        // m — мантисса (эдакое базовое число);
        // p — порядок (на сколько цифр сдвинуть запятую в мантиссе; плюс — направо, минус — налево).
        // Таким образом, 6.123233995736766E-17 превращается в 0.00000000000000006123233995736766.
    }
}
