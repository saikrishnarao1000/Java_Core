package sets;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        // Adding 10 strings to the HashSet
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");
        stringSet.add("grape");
        stringSet.add("kiwi");
        stringSet.add("mango");
        stringSet.add("strawberry");
        stringSet.add("pineapple");
        stringSet.add("peach");
        stringSet.add("pear");

        // Iterating HashSet using Iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterating HashSet using for loop
        System.out.println("\nIterating HashSet using for loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }

        // Iterating HashSet using enhanced for loop
        System.out.println("\nIterating HashSet using enhanced for loop:");
        Object[] stringArray = stringSet.toArray();
        for (Object element : stringArray) {
            System.out.println(element.toString());
        }
    }
}
