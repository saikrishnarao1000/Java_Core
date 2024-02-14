package SomeSamples;

import java.util.Arrays;

public class ArrayItemsSum {
    public int arrayItemSum(int[] arr){
        return Arrays.stream(arr).sum();
    }
}
