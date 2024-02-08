package someSamplesTest;

import SomeSamples.ReverseArrayList;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayListTest {
    ReverseArrayList ra = new ReverseArrayList();
    @Test
    public void test1(){
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);al.add(4);al.add(3);al.add(2);al.add(1);
        Assert.assertEquals(Arrays.asList(array),ra.reverseArrayList(al));
    }
}
