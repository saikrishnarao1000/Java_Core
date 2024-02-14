package SomeSamples;

import java.util.HashSet;

public class FindRepeatedNumbers {
    public String findRepeatedNumbers(int input){
        String str = input+"";
        HashSet<Character> hs = new HashSet<>();
        String result = "";
        for(int i=0;i<str.length();i++){
            if(!hs.add(str.charAt(i)) && !result.contains(str.charAt(i)+""))
                result+=str.charAt(i);
        }

        return result;
    }
}
