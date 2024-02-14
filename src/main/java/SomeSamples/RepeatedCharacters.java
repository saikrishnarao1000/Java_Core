package SomeSamples;

import java.util.HashSet;

public class RepeatedCharacters {
    public String findRepeatedCharacters(String input){
        HashSet<Character> hs = new HashSet<>();
        String result = "";
        for(int i=0;i<input.length();i++){
            if(!hs.add(input.charAt(i)) && !result.contains(input.charAt(i)+""))
                result+=input.charAt(i);
        }

        return result;
    }
}
