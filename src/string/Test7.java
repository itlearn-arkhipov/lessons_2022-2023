package string;

public class Test7 {
    public static void main(String[] args) {
        // Извлечение подстроки из строки
        String filePath = "С:\\Music\\Song.mp3";
        int lastFileSeparatorIndex =
                filePath.lastIndexOf('\\');
        String fileName =
                filePath.substring(lastFileSeparatorIndex + 1);

        System.out.println(fileName);
    }
}


