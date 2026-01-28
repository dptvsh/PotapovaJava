import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] agrs) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        List<String> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(String.valueOf(number));
            }
        }

        String result;
        if (evenNumbers.isEmpty()) {
            result = "четных чисел нет";
        } else {
            result = String.join(", ", evenNumbers);
        }

        System.out.println("Четные числа в массиве: " + result);

    }
}
