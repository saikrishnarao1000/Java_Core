package someSamplesTest;

import SomeSamples.PallendromeCheck;
import com.sun.source.tree.AssertTree;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class CheckPallendromeTest {
    PallendromeCheck pc= new PallendromeCheck();
    @Test
    public void test1(){
        Assert.assertEquals(true,pc.checkPallendrome(121));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,pc.checkPallendrome(1214));
    }

    @Test
    public void test3(){
        Assert.assertEquals(true,pc.checkPallendrome(0));
    }

    @Test
    public void test4(){
        Assert.assertEquals(true,pc.checkPallendrome(010));
    }
}
