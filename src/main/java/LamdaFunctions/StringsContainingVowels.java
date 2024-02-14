package LamdaFunctions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static Strings.VowelCount.vowelCountMethod;

public class StringsContainingVowels {
    public Map<String,Long> StringsContainingVowels(String[] arr){
            Map<String,Long> result=Arrays.stream(arr)
                    .map(str->str.toLowerCase())
                    .filter(str->vowelCheck(str)>0)
                    .collect(HashMap::new , (map,str)->map.put(str,vowelCheck(str)),HashMap::putAll);

            return result;
    }
    Long vowelCheck(String str){
        return (long) vowelCountMethod(str);
    }
}
