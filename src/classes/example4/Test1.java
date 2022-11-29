package classes.example4;

public class Test1 {
    public static void main(String[] args) {

        Program program = new Program();

        System.out.println(program.sum(2, 3));          // 5
        System.out.println(program.sum(4.5, 3.2));      // 7.7
        System.out.println(program.sum(4, 3, 7));    // 14
    }
}
