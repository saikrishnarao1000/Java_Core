import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] oldArray = new int[5];
        int[] newArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            oldArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            newArray[i] = oldArray[4 - i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(newArray[i]);
        }
    }
}
