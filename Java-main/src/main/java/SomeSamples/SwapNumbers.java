package SomeSamples;

public class SwapNumbers {
    public String swap(int a,int b){
        a = a+b ;
        b=a-b;
        a=a-b;
        return a+" "+b;
    }
}
