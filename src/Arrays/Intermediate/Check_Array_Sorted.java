package Arrays.Intermediate;

public class Check_Array_Sorted {
    public static void main(String[] args) {
        /*
        Input: arr[] = [10, 20, 30, 40, 50]
        Output: true
        Explanation: The given array is sorted.

        Input: arr[] = [90, 80, 100, 70, 40, 30]
        Output: false
        Explanation: The given array is not sorted.
         */
        int[] arr = {10,20,30,40,50};
        String result = sortedChecker(arr) ? "Yes The Arrays is Sorted" : "No The Arrays is not Sorted .";
        System.out.println(result);
    }
    static boolean sortedChecker(int[] arr){
        int l = arr.length ;
        for(int i = 0 ; i <  l-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true ;
    }
}
