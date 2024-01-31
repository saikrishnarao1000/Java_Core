package functionalInterface;

import java.util.Scanner;

public class SwapNumbers {
    public SwapNumbers(int a, int b) {
    }

    public void swapMethod(int a,int b)
    {
        a = a+b;
        b = a-b;
        a = a-b;
       //return new SwapNumbers(a,b);

    }
}
