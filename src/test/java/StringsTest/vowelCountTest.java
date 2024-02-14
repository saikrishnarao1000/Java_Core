package StringsTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static Strings.VowelCount.vowelCountMethod;

public class vowelCountTest {
    @Test
    public void test1() {
        Assert.assertEquals(2, vowelCountMethod("manoj"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5,vowelCountMethod("aeiou"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0,vowelCountMethod(null));
        //Assert.assertEquals(0,vowelCountMethod(" m "));
    }

}
