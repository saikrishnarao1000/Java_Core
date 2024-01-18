

import java.util.*;

public class MovingZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print the size of the array:");
        int n = sc.nextInt();
        int[] arr =new int[n];
        int[] fin =new int[n];
        int l=0;
        int m=n-1;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                fin[l]=arr[i];
                l++;
            }
            else
            {
                fin[m]=0;
                m--;
            }
        }
        System.out.println("original array");
        for(int z=0;z<n;z++)
        {
            System.out.print(arr[z]+" ");
        }
        System.out.print("\n");
        System.out.println("Updated array");
        for(int z=0;z<n;z++)
        {
            System.out.print(fin[z]+" ");
        }

    }

}