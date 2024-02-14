package LamdaFunctions;

import java.util.List;

public class SumOfSquares {
    public static List<Integer> filterPositiveIntegers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .toList();
    }

    // Method to calculate the square of each integer
    public static List<Integer> calculateSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .toList();
    }

    // Method to calculate the sum of the squares
    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }
}
