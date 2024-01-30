package hashmaps;

import java.util.HashMap;

public class CharacterCount {

    public static HashMap<Character,Integer>countCharacters(String inputString){
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<inputString.length();i++){
            if(hm.containsKey(inputString.charAt(i)))
                hm.put(inputString.charAt(i),hm.get(inputString.charAt(i))+1);
            else
                hm.put(inputString.charAt(i),1);
        }
        return hm;
    }
}
