package arrays;

public class MissingNumber {
     public static int missingnumber(int [] arr , int n){
        int  esum = n*(n+1)/2 ;
        int asum=0;

        for(int nums : arr){
            asum += nums;
        }

        return esum-asum;

     }
    
     public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,9,10,7};
        System.out.println(missingnumber(arr,10));
     }
}
