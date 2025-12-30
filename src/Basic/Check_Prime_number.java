package Basic;

public class Check_Prime_number {
    // Prime Number Checker.
    public static void main(String[] args) {
        int n = 25;
        String checker = primeNumberChecker(n) ? "It's a Prime Number " : "It's not a Prime Number ";
        System.out.println(checker);
    }

    static boolean primeNumberChecker(int n){

        if(n == 1 || n < 1){
            return false ;
        }
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true ;
    }

}
