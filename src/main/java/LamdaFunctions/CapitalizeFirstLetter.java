package LamdaFunctions;

import javax.print.attribute.standard.JobKOctets;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CapitalizeFirstLetter {
    public String[] capitalizeFirstLetter(String[] arr){
        String[] result = Arrays.stream(arr)
                .map(str -> str.substring(0,1).toUpperCase()+str.substring(1))
                .sorted()
                .toArray(String[]::new);

        return result;
    }
}
