import java.util.*;
public class FindPersonPhase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if(age>19)
        System.out.println("adult");
        else if(age>13)
        System.out.println("teen");
        else
        System.out.println("Kid");
    }
}
