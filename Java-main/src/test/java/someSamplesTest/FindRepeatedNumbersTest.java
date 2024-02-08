package someSamplesTest;

import SomeSamples.FindRepeatedNumbers;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class FindRepeatedNumbersTest {

    FindRepeatedNumbers rc = new FindRepeatedNumbers();
    @Test
    public void test1(){
        Assert.assertEquals("1",rc.findRepeatedNumbers(121));
        Assert.assertEquals("42",rc.findRepeatedNumbers(123442));
    }
}
