package operations.operators;

public class Test6 {
    public static void main(String[] args) {
        boolean isEqual, isNonEqual, isGreater,
                isGreaterOrEqual, isLess, isLessOrEqual;
        int x1 = 5, x2 = 5, x3 = 3, x4 = 7;
        isEqual = x1 == x2;
        // isEqual = true
        System.out.println(isEqual);

        isNonEqual = x1 != x2;
        // isNonEqual = false
        System.out.println(isNonEqual);

        isGreater = x1 > x3;
        // isGreater = true
        System.out.println(isGreater);

        isGreaterOrEqual = x2 >= x3;
        // isGreaterOrEqual = true
        System.out.println(isGreaterOrEqual);

        isLess = x3 < x1;
        // isLess = true
        System.out.println(isLess);

        isLessOrEqual = x1 <= x3;
        // isLessOrEqual = false
        System.out.println(isLessOrEqual);
    }
}


