package someSamplesTest;

import SomeSamples.ArrayItemsSum;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class ArrayItemsSumTest {
    ArrayItemsSum as = new ArrayItemsSum();
    @Test
    public void test1(){
        Assert.assertEquals(20,as.arrayItemSum(new int[]{2, 3, 4, 5, 6}));
    }
}
