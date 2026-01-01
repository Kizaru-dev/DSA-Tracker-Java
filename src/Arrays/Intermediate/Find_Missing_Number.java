package Arrays.Intermediate;

public class Find_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {21,22,23,24,25,26,27,28,30};
        int n = arr.length + 1 ;

        for(int i = 1 ; i <= n ; i++){
            boolean found = false ;
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] == i ){
                    found = true ;
                    break;
                }
            }

            if(!found){
                System.out.println("The number is " + i);
            }
        }
    }
}
