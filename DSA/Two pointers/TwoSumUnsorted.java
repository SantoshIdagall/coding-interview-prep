public class TwoSumUnsorted {
       public static void main(String [] args){
            int [] arr = {2,7,11,15};
            int left= 0;
            int right=arr.length-1;
             int target = 9;

             while(left < right){
                int sum = arr[left] + arr[right];
                if(sum==target){
                     System.out.println( left + ", " + right);
                break;
                }
                else if(sum < target){ 
                    left++;
                }
                    else{
                        right--;
                    }
                
             }

    

        }   
    

}
