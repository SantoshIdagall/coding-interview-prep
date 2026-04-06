package numberquestions;

public class _PrimeNumber {
    public static  boolean isPrime(int num){
        if (num <=  0)  return false;
             
          if (num==2)  return false;
               
          
            for( int i =0 ; i*i<=num; i++){

            if(num % 2== 0)
                 return false; 
     
            }
            return true;
    }
     public static void main(String[] args) {
        int num = 13; 
        System.out.println(isPrime(num));

     }
    
}
