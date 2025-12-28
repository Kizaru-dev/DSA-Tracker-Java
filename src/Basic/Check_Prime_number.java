package Basic;

public class Check_Prime_number {
    // Prime Number Checker.
    public static void main(String[] args) {
        int n = 25;
        String checker = primeNumberChecker(n) ? "It's a Prime Number " : "It's not a Prime Number ";
        System.out.println(checker);
    }

    static boolean primeNumberChecker(int n){
        for(int i = 2 ; i <= n-1 ; i++){
            if(n % i == 0 ){
                return false ;  // found the divisor
            }
        }
        return true ; // no divisor found .
    }

}
