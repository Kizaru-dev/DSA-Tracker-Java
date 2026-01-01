package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {12,23,24,11,22,14};
        selectionSort(arr);
    }
     static void selectionSort(int[] arr){
      int n = arr.length ;  // lenght
      for(int i =  0 ; i < arr.length - 1 ; i++){//iteration hai
          int smallest= i ;  // smallest element
          for(int j = i + 1  ; j < n ; j++){ // i + 1 to n ;
              if(arr[smallest] > arr[j]){ // agar smallest se koi bat hai to sote kardo
                  smallest  = j ;
              }
          }
          int temp = arr[smallest] ; //swapping kardo aur change kardo .
          arr[smallest]  = arr[i];
          arr[i] = temp ;
      }
        System.out.println(Arrays.toString(arr));
    }
}
