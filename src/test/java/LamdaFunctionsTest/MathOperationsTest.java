package LamdaFunctionsTest;

import LamdaFunctions.MathOperations;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class MathOperationsTest {
    MathOperations mo = new MathOperations();
    @Test
    public void test1() {
        assertEquals(8, mo.mathOperations(5, 3));
    }


}
