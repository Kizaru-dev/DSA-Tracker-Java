package Revision;

public class Find_The_largest_Smallest {
    public static void main(String[] args) {
        // Find the largest and smallest element in the arrays.

       int[] arr = {10,12,12,32,121};

       int max = arr[0];
       int min = arr[0];

       for(int i = 0 ; i < arr.length ; i++){
           if(min > arr[i]){
               min = arr[i];
           }
           if(max < arr[i]){
               max = arr[i];
           }
       }
        System.out.println("The minimum element in this array is : " + min);
        System.out.println("The maximum element in this array is : " + max);
    }
}
