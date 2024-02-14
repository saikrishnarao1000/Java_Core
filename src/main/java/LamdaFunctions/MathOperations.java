package LamdaFunctions;
@FunctionalInterface
interface  MathOperation{
    int operate(int a,int b);
}
public class MathOperations {

    public int mathOperations(int c,int d) {
        MathOperation sum = ((a, b) -> a + b);

        return(sum.operate(c,d));
    }

}
