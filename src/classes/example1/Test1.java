package classes.example1;

public class Test1 {

    public static void main(String[] args) {
        Student student = new Student();

        student.setFirstName("Иванов");
        student.setLastName("Иван");
        student.setAge(30);

        System.out.println(student.getFirstName()); // Иванов
        System.out.println(student.getLastName());  // Иван
        System.out.println(student.getAge());       // 30
    }
}

