package Youtube_Question;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {10,5,30,40,15,20,31};
        WhileMethod(arr);
        forMethod(arr);
    }
    public static void WhileMethod(int[] arr){
        int l = arr.length ;
        int start = 0;
        int end = l - 1 ;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void forMethod(int[] arr){
        int l = arr.length ;
        int[] temp = new int[l];

        for(int i = 0 ; i < l ; i++){
            temp[i] = arr[l-i-1];
        }
        for(int i = 0 ; i < l ; i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
