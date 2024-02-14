public class ZeroatEnd{
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,0,67,78,0,323,34,0};
        int somewhere =0;
        int result[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            result[somewhere++] = arr[i];
        }

        for(int i=0;i<result.length;i++)
        System.out.print(result[i]+" ");
    }
}