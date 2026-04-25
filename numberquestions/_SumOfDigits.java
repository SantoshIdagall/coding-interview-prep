package numberquestions;

public class _SumOfDigits {
    public static  int sumofdigits(int num){
         num = Math.abs(num); // handle negative
        int sum =0;
         while (num>0) {
           sum += num % 10; 
           num /= 10; 
            
         }
         return sum;
    }

    public static void main(String[] args) {
        int num =123546;
        //System.out.println(sumofdigits(num));
          int digits = sumofdigits(num);
          System.out.println("Sum Of number digts ");

    }
    
}
