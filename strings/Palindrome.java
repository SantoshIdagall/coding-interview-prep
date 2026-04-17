public class Palindrome {
  public static boolean isPalindrome(String str){
   
     char [] ch = str.toCharArray();
      int  left = 0;
      int right= ch.length-1;
       String rev= str;
        while (left<right) {
            char temp=  ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
   
        }
         return rev.equals(str);
         
     }

  //   public static String reverse(String str) { 
  //  return new StringBuilder(str).reverse().toString(); 
  //  } 


     public static void main(String[] args) {
        String str = "madam";
         System.out.println(str);
         // System.out.println(reverse(str));

     }

  }
    

