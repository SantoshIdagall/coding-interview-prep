package arrays;
class Arraymax{

    public static int findbyMax(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
      return max;

    }
     public static int finfbymin(int [] arr){
        int min = arr[0];
        for(int num : arr){
            if(num < min){
                min = num ;
            }
        }
         return min;
     }
    public static void main(String[]args){
        int []arr ={1,2,3,4,5};
        int max=findbyMax(arr);

        System.out.println("The maximum element in the array is: "+max);
        System.out.println("The manimum element in the array is: "+ finfbymin(arr));
        

        } 

    }


