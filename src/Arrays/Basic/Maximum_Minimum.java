package Arrays.Basic;

public class Maximum_Minimum {
    public static void main(String[] args) {
//        Input: arr[] = [3, 5, 4, 1, 9]
//        Output: [1, 9]
//        Explanation: The minimum element is 1, and the maximum element is 9.
//
//        Input: arr[] = [22, 14, 8, 17, 35, 3]
//        Output: [3, 35]
//        Explanation: The minimum element is 3, and the maximum element is 35.

        int[] arr ={3,5,4,1,9};
        MaxMinFinder(arr);
    }
    static void MaxMinFinder(int[] arr){
        int l = arr.length ; // find the length of the array.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }

        System.out.println("The maximum and minimum number in this array are : " + max +" , "+ min);
    }
}
