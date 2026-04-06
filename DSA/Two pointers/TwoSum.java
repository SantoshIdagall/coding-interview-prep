class TwoSum{
   public  static int [] twoSum(int [] arr , int target){
    int left=0 ;
    int right= arr.length-1;

    while (left < right)  {

        int sum = arr[left]+ arr[right];

        if (sum == target) {
            System.out.println(left +" , " + right);
             break;
        }
        else if (sum< target) {
            left++;
        } 
        else{
            right--;
        }
            
        }

           return new int[] {};
           
        }
      
         public static void main(String[] args) {
        //sorted oder
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        twoSum(arr, target); // ✅ calling function

        



    } 
    
}