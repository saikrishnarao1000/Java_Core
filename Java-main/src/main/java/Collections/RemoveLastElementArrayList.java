package Collections;

import java.util.ArrayList;

public class RemoveLastElementArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Sai");
        al.add("Ram");
        al.add("manoj");
        al.add("pusala");

        String lastelement = removeLastElement(al);
        System.out.println("last element that is removed is : "+lastelement);
        System.out.println("remaining elements : ");
        for(String element : al)
            System.out.println(element);
    }
    public static String removeLastElement(ArrayList<String> al){
        return al.remove(al.size()-1);
    }
}
