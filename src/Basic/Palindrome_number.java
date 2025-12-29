package Basic;

public class Palindrome_number {
    public static void main(String[] args) {
        int n = 501020105 ;
        System.out.println(isPalindrome(n));

    }
    public static boolean isPalindrome(int n) {
        // code here
        int reserve = 0 ;
        int clone = n ;

        if(n < 9 && n > 0 ){
            return true ;
        }

        while(clone != 0 ){
            int remainder = clone % 10 ;
            clone  /= 10 ;
            reserve = (reserve * 10 ) + remainder ;
        }

        if(n == reserve){
            return true ;
        }
        return false ;
    }
}
