package someSamplesTest;

import SomeSamples.RepeatedCharacters;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RepeatedCharactersTest {
    RepeatedCharacters rc = new RepeatedCharacters();
    @Test
    public void test1(){
        Assert.assertEquals("a",rc.findRepeatedCharacters("sairam"));
        Assert.assertEquals("am",rc.findRepeatedCharacters("sairammanoj"));
    }
}
