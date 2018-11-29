public class Recursion {

    public static int fact(int n){
        if (n == 1)
            return 1;

        else
            return n * fact(n-1);
    }

    public static int fib(int n){
        if(n == 2){
            return 1;
        }

        if(n==1){
            return 0;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}
