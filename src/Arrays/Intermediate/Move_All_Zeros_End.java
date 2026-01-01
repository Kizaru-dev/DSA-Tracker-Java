package Arrays.Intermediate;

import java.util.Arrays;

public class Move_All_Zeros_End {
    public static void main(String[] args) {
        // Move all The Zero at the end of the array .
        int[] arr = {0,1,0,2,0,3,0,4,0,5};
        moveZero(arr);
    }
    static void moveZero(int[] arr){
        int l = arr.length ;
        int[] temp = new int [l];
        int k = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0 ){
                temp[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
