package UnNecessaryTest;

import UnNecessary.Code2;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class Code2Test {
    Code2 c2=new Code2();
    @Test
    public void test1(){
        Assert.assertEquals(7,c2.countOperations("011100"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5,c2.countOperations("111"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(22,c2.countOperations("1111010101111"));
    }

    @Test
    public void test4(){
        String str = "1".repeat(400000);
        Assert.assertEquals(799999,c2.countOperations(str));
    }

}
