package Youtube_Question;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,5,30,40,15,20,31};
        secondLargestElementFinder(arr);
    }
    public static void secondLargestElementFinder(int[] arr){
        int l = arr.length ;
        int first = 0 ;
        int second = 0 ;

        for(int i = 0 ; i < l ; i++){
            if(arr[i] > first){
                second = first ;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("The second largest element in This array is : " + second);
    }
}
