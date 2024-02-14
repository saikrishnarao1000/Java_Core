package LamdaFunctions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {
    public static Map<Integer, List<String>> groupByLength(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    // Method to print the grouped strings
    public static void printGroupedStrings(Map<Integer, List<String>> groupedByLength) {
        groupedByLength.forEach((length, strings) -> {
            System.out.println("Length " + length + ": " + strings);
        });
    }
}
