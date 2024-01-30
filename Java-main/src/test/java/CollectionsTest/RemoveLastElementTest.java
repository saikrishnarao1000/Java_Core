package CollectionsTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Collections.RemoveLastElementArrayList.removeLastElement;

public class RemoveLastElementTest {

    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();

        al.add("Sai");
        al.add("Ram");
        al.add("manoj");

        Assert.assertEquals("manoj",removeLastElement(al));

    }
    @Test
    public void test2(){
        ArrayList<String> al = new ArrayList<>();

        al.add("ha");
        al.add("hahah");
        al.add("hehehe");

        Assert.assertEquals("chandram",removeLastElement(al));

    }

    @Test
    public void test3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("ha");
        al.add(null);
        al.add("tatta daw");

        Assert.assertEquals("tatta daw",removeLastElement(al));

    }
}
