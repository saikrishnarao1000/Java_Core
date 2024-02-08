package someSamplesTest;

import SomeSamples.Factorial;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    Factorial f = new Factorial();

    @Test
    public void test1(){
        Assert.assertEquals(24,f.getFactorial(4));

        Assert.assertEquals(40320,f.getFactorial(8));
    }
}
