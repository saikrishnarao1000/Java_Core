package CollectionsTest;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Collections.RemoveLastElementArrayList.removeLastElement;
import static Collections.TraverseArrayList.traverseList;

public class ListTraverseTest {
    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();

        al.add("Sai");
        al.add("Ram");
        al.add("manoj");

        Assert.assertTrue(traverseList(al));

    }
    @Test
    public void test2(){
        ArrayList<String> al = new ArrayList<>();

        al.add("ha");
        al.add("hahah");
        al.add("hehehe");

        Assert.assertTrue(traverseList(al));

    }

    @Test
    public void test3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("ha");
        al.add(null);
        al.add("tatta daw");

        Assert.assertTrue(traverseList(al));

    }
}
