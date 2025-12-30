package Arrays.Basic;

public class Average_Array {
    public static void main(String[] args) {
        //Input : arr[] = {1, 2, 3, 4, 5}
        //Output : 3
        //Sum of the elements is 1+2+3+4+5 = 15
        //and total number of elements is 5.
        //So average is 15/5 = 3

        int[] arr = {1,2,3,4,5};
        averageFinder(arr);
    }
    static void averageFinder(int[] arr){
        int l = arr.length  ; // length = 5 ;
        int sum = 0 ;  // local variable to add all the element .
        for(int i = 0 ; i < arr.length ; i++){      // iterate the loop and add all the element
            sum  += arr[i];
        }
        int result = sum / l  ; // divide the total with the length of the array.
        System.out.println("The Average number of This Arrays = " + result); // print the result .
    }
}
