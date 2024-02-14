public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        int rotatePlace = 2;
        int rotatedArray[] = new int[arr.length];
        int index=0,i;
        for(i=rotatePlace;i<arr.length;i++){
            rotatedArray[index]=arr[i];
            index++;
        }
        for(i=0;i<rotatePlace;i++){
            rotatedArray[index]=arr[i];
            index++;
        }

        for(i=0;i<rotatedArray.length;i++)
        System.out.print(rotatedArray[i]+" ");
    }
}
