package Youtube_Question;

public class MaximumAndMinimum {
  public static void main(String[] args) {
    int[] arr = {10,5,30,40,15,20,31};
    maximumFinder(arr);
    minimumFinder(arr);
  }
  public static void  maximumFinder(int[] arr){
    int max = arr[0];

    for(int i : arr){
      if(max < i){
        max = i ;
      }
    }
    System.out.println("The maximum element in This array :  " + max );
  }
  public static void minimumFinder(int[] arr){
    int min = arr[0];
    for(int i : arr){
      if(min > i){
        min = i ;
      }
    }
    System.out.println("The minimum element in this array is : " + min);
  }


}
