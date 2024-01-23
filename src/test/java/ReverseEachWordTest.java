import Strings.ReverseEachWord;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static Strings.ReverseEachWord.reverseWords;

public class ReverseEachWordTest {

    @Test
    public void test1(){
        Assert.assertEquals("avaJ EE2J esreveR eM", reverseWords("Java J2EE Reverse Me"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(null,reverseWords(null));
    }

    @Test
    public void test3(){
        Assert.assertEquals(" ",reverseWords(" "));
    }

    @Test
    public void test4(){
        Assert.assertEquals(null,reverseWords(null));
    }

}
