import java.util.NoSuchElementException;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = readStrFromUser(scanner, "Введите первую строку: ");
        String str2 = readStrFromUser(scanner, "Введите вторую строку: ");

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки неидентичные.");
        }
    }
    
    private static String readStrFromUser(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Ввод прерван, программа завершена.");
                System.exit(1);
            }
        }
    }
}
