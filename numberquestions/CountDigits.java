package numberquestions;

public class CountDigits {
    public static int countDigits(int n) { 
if (n == 0) return 1; 
int count = 0; 
while (n != 0) { 
n /= 10; 
count++; 
} 
return count; 
}
public static void main(String[] args) {
    int n = 12324;
    System.out.println(countDigits(n));
}
    
}
