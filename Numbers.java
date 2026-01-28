import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Numbers {

    public static int readIntFromUser(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не целое число, пожалуйста, попробуйте снова.");
                scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Ввод прерван, программа завершена.");
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readIntFromUser(scanner, "Введите первое целое число (a): ");
        int b = readIntFromUser(scanner, "Введите второе целое число (b): ");
        
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Деление: " + a + " / " + b + " = " + 
                String.format("%.2f", result));
        } else {
            System.out.println("Деление: На ноль делить нельзя!");
        }
        
        scanner.close();
    }
}