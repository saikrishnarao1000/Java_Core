package LamdaFunctions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortArray {
    public String[] sortArray(String[] arr){
        return Arrays.stream(arr)
                .sorted((stringOne, stringTwo) -> {
                    if(stringOne.length() == stringTwo.length())
                        return stringTwo.charAt(stringTwo.length() - 1)
                                - stringOne.charAt(stringOne.length() - 1);
                    else
                        return stringOne.length() - stringTwo.length();
                })
                .toArray(String[] :: new);
    }
}
