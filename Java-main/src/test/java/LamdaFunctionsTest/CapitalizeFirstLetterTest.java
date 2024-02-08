package LamdaFunctionsTest;

import LamdaFunctions.CapitalizeFirstLetter;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CapitalizeFirstLetterTest {
    CapitalizeFirstLetter cf = new CapitalizeFirstLetter();
    @Test
    public void test1(){
        String[] strings = {"apple", "banana", "orange", "grape"};
        String[] resultStrings ={"Apple", "Banana", "Grape", "Orange"};
        assertArrayEquals(resultStrings,cf.capitalizeFirstLetter(strings));
    }
}
