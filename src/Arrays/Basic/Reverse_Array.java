package Arrays.Basic;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        /*
            Input: arr[] = [1, 4, 3, 2, 6, 5]
            Output:  [5, 6, 2, 3, 4, 1]
            Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

            Input: arr[] = [4, 5, 1, 2]
            Output: [2, 1, 5, 4]
            Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
         */
        int[] arr = {1,4,3,2,6,5};
        reverseArray(arr);
    }
    static void reverseArray(int[] arr ){
        int l = arr.length ; // The length of the array .
        int start = 0 ;  // starting point of the array.
        int end =  l - 1 ; // ending point of the array .

        // This Technique is known as Two-pointer Technique .
        while(start < end){     // run anthill the condition is false ;
            int temp = arr[start]; // store the first element in temp  ;
            arr[start] = arr[end]; // store the last element in first element .
            arr[end] = temp ;  // store the temp variable in to last element .
            start ++ ; // increase the start
            end -- ; // decrement the end .
        }
        System.out.println(Arrays.toString(arr));
    }
}
