package LamdaFunctions;

import java.util.Arrays;

public class AverageOfSquares {
    public double averageOfSquares(int[] arr){
        return Arrays.stream(arr).filter(n-> n%2!=0).mapToDouble(n->n*n).average().orElse(0);
    }
}
