package Youtube_Question;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {10,5,30,40,15,20,31};
        EvenFinder(arr);
    }
    public static void EvenFinder(int[] arr){
        int l = arr.length ;
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println("The Even element in this array is : " + i );
            }
        }
        for(int i : arr){
            if( i % 2 != 0){
                System.out.println("The Odd element in this array is : " + i );
            }
        }

    }
}
