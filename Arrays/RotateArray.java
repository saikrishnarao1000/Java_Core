import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {


        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        int n = scanner.nextInt();
        int[] oldArray = new int[n];
        int[] newArray = new int[n];
        int[] tempArray = new int[n];
        System.out.println("enter array");
        for(int i = 0;i< n;i++)
        {
            oldArray[i] = scanner.nextInt();
        }
        for(int i = 2; i<n;i++)
        {
                newArray[i] = oldArray[i-2] ;
        }

        for(int i = 1;i>=0;i--)
        {
             tempArray[i] =  oldArray[n-i-1];
        }


            newArray[0] = tempArray[1];
        newArray[1] = tempArray[0];
       for(int i = 0;i<n;i++)
       {
           System.out.println(newArray[i]);
       }


    }
}
