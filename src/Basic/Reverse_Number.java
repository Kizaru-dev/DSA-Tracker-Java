package Basic;

import java.util.Arrays;

public class Reverse_Number {
    public static void main(String[] args) {
        // Reverse the Number .
        int[] nums = {1,2,3,4,5,6,7,8,9};
        reverseNumber(nums);
    }
    static void reverseNumber(int[] nums){
        int start = 0 ;
        int end = nums.length -1 ;

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++ ;
            end-- ;
        }
        System.out.println(Arrays.toString(nums));
    }
}
