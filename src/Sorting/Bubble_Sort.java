package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {23,123,12,42,21,321,41};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length ;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
