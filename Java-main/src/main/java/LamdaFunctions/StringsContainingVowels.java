package LamdaFunctions;

import java.util.Arrays;

public class StringsContainingVowels {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "pear"};

        Arrays.stream(strings)
                .filter(str -> containsVowels(str))
                .forEach(str -> {
                    int vowelCount = countVowels(str);
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });
    }

    public static boolean containsVowels(String str) {
        return str.toLowerCase().chars().anyMatch(ch -> "aeiou".indexOf(ch) != -1);
    }

    public static int countVowels(String str) {
        return (int) str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}
