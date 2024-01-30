
public class Sorting_1 {
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        for(int i =0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
