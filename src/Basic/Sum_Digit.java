package Basic;

public class Sum_Digit {
    public static void main(String[] args) {
        int n = 1231;
        sumDigit(n);
    }
    static void sumDigit(int n){
        if(n < 0 && n > 10){
            System.out.println("The sum of This Digit is  = " +  n );
        }
        int result = 0 ;
        while(n != 0){
            int remainder = n % 10 ;
            n /= 10 ;
            result +=remainder ;
        }
        System.out.println("The sum of This Digit is = " +  result);
    }
}
