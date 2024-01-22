import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int n = sc.nextInt();
        if (n > 19) {
            System.out.print("adult");
        } else if (n < 13) {
            System.out.print("child");
           // return "child";
        } else {
            System.out.println("teen");
        }
    }
}
