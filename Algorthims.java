package sorting.algorithms;

public class Algorthims {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int factorial(int n) {
        if ((n == 1) || (n == 0)) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean palindrome(String txt) {
        int len = (txt.length() - 1);
        if (len == 0 || len == -1) {
            return true;
        } else {
            if (txt.charAt(0) == txt.charAt(len)) {
                return palindrome(txt.substring(1, len));
            }
            return false;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    /*
    public static int tPoly(int x) {
        
    }
*/
    
    public static int countX(String s){
        int len = s.length();

        if(len == 0){
            return 0;
        }
        else{
            if(s.charAt(len - 1) == 'x'){
                return countX(s.substring(0, len - 1)) + 1;
            }
            else{
                return countX(s.substring(0, len - 1));
            }
        }
    }
    
    public static int powerN(int base, int n){
        if(n == 1){
            return base * 1;
        }
        else{
            return base * powerN(base, n - 1);
        }
    }
    
    public static int count8(int n){
        if(n == 8){
            return 1;
        }
        else if((n % 10) == n && n != 8){
            return 0;
        }
        else{
            if()
        }
    }
}