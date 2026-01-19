package StringIntroduction;

import java.util.Arrays;

public class Class_02 {
    public static void main(String[] args) {
        // Solve some problem .
        // theory .
        // String is Thread Safe  but slow
        // StringBuilder is NotThread Safe but fast
        // StringBuffer is Thread Safe but slow .
        // we use StringBuilder in loop and while loop .


        String name = "Priyanshu";
       reverseString(name);
    }
    public static void reverseString(String name){
        char[] arr = name.toCharArray();
        int i = 0 ; int j = arr.length -1 ;

        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
