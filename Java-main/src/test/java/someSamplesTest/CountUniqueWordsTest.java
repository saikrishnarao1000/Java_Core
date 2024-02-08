package someSamplesTest;

import SomeSamples.CountUniqueWords;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class CountUniqueWordsTest {

    CountUniqueWords cw = new CountUniqueWords();
    @Test
    public void test1(){
        Assert.assertEquals(3,cw.countUniqueWords("sai s sa"));

        Assert.assertEquals(1,cw.countUniqueWords("sai sai sa"));

        Assert.assertEquals(0,cw.countUniqueWords("sai sai sai"));
    }
}
