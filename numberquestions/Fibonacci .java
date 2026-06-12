package numberquestions;

public class Fibonacci  {
    public static void fibonacci(int num) { 
int n1 = 0, n2 = 1; 
for (int i = 0; i < num; i++) { 
System.out.print(n1+ " " + n2); 
int n3 = n1 + n2; 
    System.out.println(n3);
    n1= n2;
     n2 = n3;
} 
    }

public static void main(String[] args) {
    int num = 10 ;
     System.out.println(fibonacci(num));
}
    
}
}
