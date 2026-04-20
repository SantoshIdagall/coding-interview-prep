package arrays;

public class RemoveDublicates {
    public static int RemoveDublicates(int [] nums){
         if (nums.length == 0) return 0;
     int i=0;

     for(int j=1 ; j<= nums.length-1; j++){
        if(nums[j] != nums[i]){
         i++;
         nums[i] = nums[j];
        }

     }
     return i+1;
    }
    public static void main(String[] args) {
        int[]  nums ={1,1,2,2,3,3,};
       int k = RemoveDublicates(nums);

System.out.println(k);

for (int i = 0; i < k; i++) {
    System.out.print(nums[i] + " ");
}
    
}
}