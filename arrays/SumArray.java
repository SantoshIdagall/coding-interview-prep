package arrays;

public class SumArray {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int result = sumArray(arr);

        System.out.println("Sum of array elements: " + result);
    }
}
