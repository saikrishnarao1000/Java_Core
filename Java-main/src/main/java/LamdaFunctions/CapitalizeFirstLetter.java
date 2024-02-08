package LamdaFunctions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CapitalizeFirstLetter {
    public String[] capitalizeFirstLetter(String[] arr){
        Arrays.stream(arr).map(str -> Character.toUpperCase(str.charAt(0))+str.substring(1));
        Arrays.sort(arr);
        return arr;
    }
}
