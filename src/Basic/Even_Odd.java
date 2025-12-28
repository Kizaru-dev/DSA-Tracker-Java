package Basic;

public class Even_Odd {
    public static void main(String[] args) {
        //  check even or odd .
        int[] number = {1,2,3,4,5,6,7,8,9,0};
        numberChecker(number);

    }
    static void numberChecker(int[] number){
        int even = 0 ;
        int odd = 0 ;
        for (int j : number) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The ToTal number of Even number in This array is : " + even);
        System.out.println("The Total number of Odd number in This array is : " + odd);
    }
}
