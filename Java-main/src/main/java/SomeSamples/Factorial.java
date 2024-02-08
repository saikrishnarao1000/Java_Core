package SomeSamples;

public class Factorial {
    public int getFactorial(int input){
        int result =1;
        for(int i =1 ;i<=input;i++)
            result*=i;
        return result;
    }
}
