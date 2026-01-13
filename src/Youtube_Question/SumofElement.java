package Youtube_Question;

public class SumofElement {
  public static void main(String[] args) {
    int[] arr = {10,5,30,40,15,20,31};
    sumeofElement(arr);
  }
  public static void sumeofElement(int[] arr){
    int l = arr.length ;
    int total = 0 ;
    for(int i : arr){
      total += i ;
    }
    System.out.println("The Total Sum of This Number is : " + total);
  }
}
