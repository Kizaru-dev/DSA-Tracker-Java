package Arrays.Basic;

public class Second_Smallest_Element {
    public static void main(String[] args) {
//        Input: arr[] = [12, 25, 8, 55, 10, 33, 17, 11]
//        Output: [8, 10]
//        Explanation: The smallest element is 1 and second smallest element is 10.
//
//        Input: arr[] = [2, 4, 3, 5, 6]
//        Output: [2, 3]
//        Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
//
//                Input: arr[] = [1, 1, 1]
//        Output: [-1]
//        Explanation: Only element is 1 which is smallest, so there is no second smallest element.
        int[] arr = {12,25,8,55,10,33,17,11};
        secondsmallestFinder(arr);

    }
    static void secondsmallestFinder(int[] arr){
        int l = arr.length ;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0 ; i < l ; i++){
            if(first > arr[i]){
                second = first ;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("The second smallest element in This arrays is : " + second);
    }
}
