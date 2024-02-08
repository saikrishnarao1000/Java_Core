package someSamplesTest;

import SomeSamples.LToUandViceVersa;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class LToUandViceVersaTest {
    LToUandViceVersa ob = new LToUandViceVersa();
    @Test
    public void test1(){
        Assert.assertEquals("MaNoj",ob.ltouandViceVersa("mAnOJ"));

        Assert.assertEquals("He shells",ob.ltouandViceVersa("hE SHELLS"));
    }
}
