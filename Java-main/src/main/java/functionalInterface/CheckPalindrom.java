package functionalInterface;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string);
        CheckPalindrom check = new CheckPalindrom();
        System.out.println(check.checkNumber(string));

    }
    public boolean checkNumber(String string){
        StringBuilder str = new StringBuilder(string).reverse();
        System.out.println(str);
        return string.equals(str.toString());
    }
}
