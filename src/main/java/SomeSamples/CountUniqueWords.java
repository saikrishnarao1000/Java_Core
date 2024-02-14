package SomeSamples;

import java.util.HashMap;

public class CountUniqueWords {
    public int countUniqueWords(String input){
        HashMap<String,Integer> hm  = new HashMap<>();
        int count =0;
        if(input == null )
            return count;
        else{
            String[] arr = input.split(" ");
            for(String element:arr)
                if(hm.containsKey(element))
                    hm.put(element, hm.get(element)+1);
                else
                    hm.put(element,1);

            for (HashMap.Entry<String, Integer> entry : hm.entrySet())
                if(entry.getValue()==1)
                    count++;
        }
        return count;
    }
}
