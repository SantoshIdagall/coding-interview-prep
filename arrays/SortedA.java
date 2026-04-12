package arrays;

public class SortedA {
    public  static boolean isSorted(int [] arr){
        for(int i = 0; i< arr.length -1 ; i++){
            if (arr[i] > arr[i + 1]) {
                return false;
                
            }

        }
        return true; 

    }
   /*public static boolean isSorted1(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }
    return true;
    }
  */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    
}
