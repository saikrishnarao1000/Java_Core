import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number : ");
        int number= sc.nextInt();
        int rev=0;
        while(number>0){
            rev*=10;
            rev+=number%10;
            number/=10;
        }

        System.out.println("reverse of number is : "+rev);
    }
}
