import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = scanner.nextInt();
       // System.out.println(n);
        int temp = 0;
        while(n != 0){
            temp = temp*10+n%10;
            n = n/10;
        }
        System.out.print(temp);

    }

}
