package Basic;

public class Factorial_of_Number {
    public static void main(String[] args) {
        // Factorial of the Number .
        int n = 5 ; // 5 = 5 * 4 * 3 * 2 * 1  = 120.
        factorialNumberChecker(n);
    }
    static void factorialNumberChecker(int n ){
        int result = 1 ;

        for(int i = 5 ; i > 0 ; i--){
            result *= i ;
        }
        System.out.println("The Factorial of the This Number : " + result );
    }
}
