package ArraysImplementation;

public class Largest_Smallest {
    public static void main(String[] args) {
        int small=10000,large=0;
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large)
                large = arr[i];
            if(arr[i]<small)
                small =  arr[i];
        }

        System.out.println("Smallest is "+small);
        System.out.println("Largest is "+large);
    }
}
