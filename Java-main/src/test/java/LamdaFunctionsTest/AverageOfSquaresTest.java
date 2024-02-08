package LamdaFunctionsTest;

import LamdaFunctions.AverageOfSquares;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class AverageOfSquaresTest {
    AverageOfSquares as = new AverageOfSquares();
    @Test
    public void test1(){
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Assert.assertEquals(33.0,as.averageOfSquares(numbers));
    }
}
