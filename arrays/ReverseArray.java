package arrays;
//import java.util.Arrays;
class ReverseArray{
    // basic way to reverse an array
   /*  public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
        */

   // using two pointer approach to reverse an array
   
   // public static  int [] reverse(int []  arr){
   public static void reverse(int[] arr) {
    int left =0;
     int right = arr.length-1;

     while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]= temp;
         left++;
         right--;  
     }
    //  return arr;
     // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
     //
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
       reverse(arr);
             

       // System.out.println(Arrays.toString(reverse(arr)));
    }

}
