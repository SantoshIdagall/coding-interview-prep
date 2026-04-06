package numberquestions;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        //if (n < 0) return false;
        int org = n;
         int rev=0;
         while (n> 0) {
            rev= rev*10 + n%10;
            n/=10;
         }
          return org == rev;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    
}
