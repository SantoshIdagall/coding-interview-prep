package numberquestions;

import java.math.BigInteger;

public class Factorial { 
   // int → up to 12! (479001600)
   // long → up to 20! (2432902008176640000)
   //
     public static int findfactorial(int n){
    int fact = 1;

    for(int i =1 ; i<=n; i++){
        fact *= i;
    }
     return fact;
    } 

    // Recursive Approach 
    /*public static  long factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if (n== 0 || n == 1) return n;
        return n* factorial(n-1);

    }
        /* */

       // BigInteger → for very large numbers (no fixed max)
       /*  public static BigInteger factorial(int n){
            BigInteger fact = BigInteger.ONE;

            for(int i =1; i<=n; i++){
                fact = fact.multiply(BigInteger.valueOf(i));

            }
            return fact;
        } */
        
    public static void main(String[] args) {
        int n = 5 ;
        //long n = 5;
         
        System.out.println(findfactorial(n));
        //System.out.println(factorial(n));
    
    }
    /*public static long findfactorial(long n){
         long fact =1 ;
          for( long i = 1; i<=n ; i++){
            fact*=i;
          }
           return fact;
    
}
           */
}