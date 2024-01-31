package functionalInterface;

public class Factorial {
    public int checkFactors(int x) {
        if (x > 0) {


            for (int i = 1; i < x; i++) {
                if ((x % i) == 0) ;
                {
                    return i;
                }
            }
        }
        return 0;
    }
}
