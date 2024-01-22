import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length");
        int n = scanner.nextInt();
        int[] oldArray = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
            oldArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {


                if (oldArray[j] > oldArray[i]) {
                    temp = oldArray[i + 1];
                    oldArray[i + 1] = oldArray[i];
                    oldArray[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(oldArray[i]);
        }
    }
}
