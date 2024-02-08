package LamdaFunctionsTest;

import LamdaFunctions.StringToIntegerConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class StringToIntegerConverterTest {
    StringToIntegerConverter st= new StringToIntegerConverter();

    @Test
    public void testConvertAndPrint_ValidInput() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        assertEquals(23, converter.convertAndPrint("23"));
    }

    @Test
    public void testConvertAndPrint_InvalidInput() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        assertEquals(0, converter.convertAndPrint("45.67"));
    }

    @Test
    public void testConvertAndPrint_NonNumericInput() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        assertEquals(0, converter.convertAndPrint("test"));
    }

    @Test
    public void testConvertAndPrint_MixedInput() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        assertEquals(0, converter.convertAndPrint("123f"));
    }



}
