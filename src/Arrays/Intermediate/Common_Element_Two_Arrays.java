package Arrays.Intermediate;

import java.util.ArrayList;
import java.util.Collections;

public class Common_Element_Two_Arrays {
    public static void main(String[] args) {

        int[] a = {3,4,2,2,4};
        int[] b = {3,2,2,7};
        System.out.println(commonElements(a,b));

    }
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        ArrayList<Integer>list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                    break; // avoid duplicate matching
                }
            }
        }

        Collections.sort(list);
        return list;

    }
}
