package LamdaFunctions;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersAndDouble {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // Method to double each number
    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

}
