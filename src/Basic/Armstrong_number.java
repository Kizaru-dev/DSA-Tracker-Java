package Basic;

public class Armstrong_number {
    public static void main(String[] args) {
        int n = 153 ;
        armstrongChecker(n);
    }
    static void armstrongChecker(int n){
        int clone = n ;
        int r = 0 ;
        int result = 0 ;

        while(clone != 0 ){
            r = clone % 10 ;
            clone /= 10 ;
            result += (r*r*r);
        }
        if(n == result){
            System.out.println("It's the Armstrong number");
        }
        else{
            System.out.println("It's not a Armstrong number . ");
        }
    }
}
