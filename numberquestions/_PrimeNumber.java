package numberquestions;

public class _PrimeNumber {
    public static  boolean isPrime(int nums){
        if (nums <= 1)  return false;
            for( int i = 2;  i*i<=nums; i++){
            if(nums % i== 0)
                 return false; 
     
            }
            return true;
    }
     public static void main(String[] args) {
        int num = 13; 
        System.out.println(isPrime(nums));

     }
    
}
