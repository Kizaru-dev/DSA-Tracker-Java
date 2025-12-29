package Basic;

public class Count_Digit_Number {
    public static void main(String[] args) {
        int n = 234233 ;
        String result  = countDigitNumber(n) == -1 ? "You have negative number " : "The Total numbers of digit in This number are : ";
        System.out.println(result + countDigitNumber(n));

    }
    static int countDigitNumber(int n ){
        if(n <  0 ){
            return -1 ;
        }
        int count = 0 ;
        while(n != 0 ){
            n/= 10  ;
            count++ ;
        }
        return count ;
    }
}
