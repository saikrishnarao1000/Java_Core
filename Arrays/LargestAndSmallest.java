import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args)
    {
        int[] NewArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array");
        for(int i = 0;i<5;i++)
        {
            NewArray[i] = scanner.nextInt();
        }
        int temp = 0;
        for(int i = 0;i<4;i++)
        {
            if(NewArray[0]<NewArray[i+1])
            {
               temp = NewArray[0];
               NewArray[0] = NewArray[i+1];
               NewArray[i+1] = temp;
            }
            else
            {
              i++;
            }
        }
        System.out.println(NewArray[0]+"largest");
        for(int i = 0;i<4;i++)
        {
            if(NewArray[0]>NewArray[i+1])
            {
                temp = NewArray[0];
                NewArray[0] = NewArray[i+1];
                NewArray[i+1] = temp;
            }
            else
            {
                i++;
            }
        }
        System.out.println(NewArray[0]+"smallest");
    }
}
