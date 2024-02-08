package someSamplesTest;


import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {
    public Map<String,Integer> hashMapSorting(Map<String,Integer> hm) {
        Map<String,Integer> tm = new TreeMap<>(hm);
        return tm;
    }

}
