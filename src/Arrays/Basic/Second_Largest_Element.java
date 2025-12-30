package Arrays.Basic;

public class Second_Largest_Element {
    public static void main(String[] args) {
        /*
            Input: arr[] = [12, 35, 1, 10, 34, 1]
            Output: 34
            Explanation: The largest element of the array is 35 and the second largest element is 34.

            Input: arr[] = [10, 5, 10]
            Output: 5
            Explanation: The largest element of the array is 10 and the second largest element is 5.

            Input: arr[] = [10, 10, 10]
            Output: -1
            Explanation: The largest element of the array is 10 there is no second largest element.
         */
        int[] arr = {10, 10, 10};
        secondlargestFinder(arr);
    }
    static void secondlargestFinder(int[] arr ){
        int l = arr.length ;
        int first = 0 ;
        int second = 0 ;

        for(int i  = 0 ; i < l ; i ++) {
            if(first < arr[i]){
                second = first ;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        if(first == second){
            System.out.println("There is no second largest element in this array ");
        }
        System.out.println("The Second Largest Element In This Arrays is : " + second);
    }
}
