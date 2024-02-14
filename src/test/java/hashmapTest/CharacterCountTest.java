package hashmapTest;


import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static hashmaps.CharacterCount.countCharacters;

public class CharacterCountTest {

    @Test
    public void test1(){
        String input = "test string";
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('t',3);
        hm.put('e',1);
        hm.put('s',2);
        hm.put('r',1);
        hm.put('i',1);
        hm.put('n',1);
        hm.put('g',1);
        Assert.assertEquals(hm,countCharacters(input));
    }

    @Test
    public void test2(){
        String input = "teststring";
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('t',3);
        hm.put('e',1);
        hm.put('s',2);
        hm.put('r',1);
        hm.put('i',1);
        hm.put('n',1);
        hm.put('g',1);
        Assert.assertEquals(hm,countCharacters(input));
    }
}
