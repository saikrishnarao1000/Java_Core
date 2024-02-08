package someSamplesTest;

import SomeSamples.SwapNumbers;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class SwapNumbersTest {
    SwapNumbers sn = new SwapNumbers();
    @Test
    public void test1(){
        Assert.assertEquals("20 10",sn.swap(10,20));

        Assert.assertEquals("13 19",sn.swap(19,13));
    }

}
