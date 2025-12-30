package Arrays.Basic;

public class Sum_Element {
    public static void main(String[] args) {
        /*
        nput : arr[] = {1, 2, 3}
        Output : 6
        Explanation: 1 + 2 + 3 = 6

        Input : arr[] = {15, 12, 13, 10}
        Output : 50
         */
        int[] arr = {1,2,4};
        sumElement(arr);
    }
    static void sumElement(int[] arr){
        int result = 0 ;
        for(int j : arr ){
            result  += j ;
        }
        System.out.println("The sum of the element is " + result);
    }
}
