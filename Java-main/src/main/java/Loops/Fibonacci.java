import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        int a=0,b=1;
        System.out.print(a+" "+b);
        while(num>2){
            int temp = a+b;
            a=b;
            b=temp;
            System.out.print(" "+b);
            num--;
        }
    }
}
