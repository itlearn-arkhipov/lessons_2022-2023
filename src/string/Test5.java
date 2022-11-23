package string;

public class Test5 {
    //Разбиение строки на массив строк
    public static void main(String[] args) {
        String people = "Иванов Иван Иванович; " +
                "Петров Петр Петрович; " +
                "Марьина Мария Мариновна; " +
                "Сидоров Сидр Сидорович; " +
                "Николаев Николай Николаевич";

        String[] peopleArray = people.split("; ");

        for (String human : peopleArray) {
            System.out.println(human);
        }
    }
}

