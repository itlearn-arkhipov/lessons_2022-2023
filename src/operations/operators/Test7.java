package operations.operators;

public class Test7 {
    public static void main(String[] args) {
        boolean isInRange, isValid, isNotValid,
                isEqual, isNotEqual;
        int x = 8;

        isInRange = x > 0 && x < 5;
        // isInRange = false
        System.out.println(isInRange);

        isValid = x > 0 || x > 5;
        // isValid = true
        System.out.println(isValid);

        isNotValid = !isValid;
        // isNotValid = false
        System.out.println(isNotValid);

        isEqual = isInRange == isValid;
        // isEqual = false
        System.out.println(isEqual);

        isNotEqual = isInRange != isValid;
        // isNotEqual = true
        System.out.println(isNotEqual);

    }
}
