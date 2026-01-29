import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] agrs) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.print("Четные числа в массиве: ");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

    }
}
