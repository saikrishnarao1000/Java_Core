public class SearchArray {

        public static void main(String[] args) {
            int[] array = {4, 2, 8, 1, 7, 5, 3};
            int target = 8;

            int result = linearSearch(array, target);

            if (result != -1) {
                System.out.println("Element " + target + " is found at index " + result);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }

        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

