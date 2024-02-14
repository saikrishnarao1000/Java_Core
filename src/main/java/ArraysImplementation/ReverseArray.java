public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        int swapper;
        for(int i=0;i<arr.length/2;i++){
            swapper = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = swapper;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
