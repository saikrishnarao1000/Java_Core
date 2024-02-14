package sets;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
    }
}
