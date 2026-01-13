package Youtube_Question;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,5,30,40,15,20,31};
        int[] nums = {1,2,3,4,5,6,7};
        sortedChecker(nums);
    }
    public static void sortedChecker(int[] arr){
        int l = arr.length ;
        boolean checker = false ;

        for(int i = 0 ;i < l -1; i++){
            if(arr[i] > arr[i+1]) {
                checker = true;
                break;
            }
        }
        String printer = (checker) ? "It's not a sorted Array " : "It's a sorted array";
        System.out.println(printer);

    }
}

