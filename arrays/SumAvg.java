package arrays;

public class SumAvg {

    public static int sumArray(int [] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return    sum;
         
    }

    public static double  avgArray(int [] arr){
        int sum = 0;
         for(int nums : arr){
            sum += nums;

         }
         return(double)sum/2;
    }
    public static void main(String[] args) {
         int [] arr = { 1,2,3,4,5,};
         System.out.println(sumArray( arr ));
         System.out.println(avgArray( arr ));

    }
    
}
