package Youtube_Question;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,5,30,40,15,20,31};
        secondSmallestElement(arr);

    }
    public static void secondSmallestElement(int[] arr){
        int l = arr.length;
        int first = arr[0] ;
        int second = arr[0] ;
        for(int i = 0 ; i < l  ; i++){
            if(arr[i] < first){
                second = first ;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("The Second Smallest Element in This array is : " + second);
    }
}
