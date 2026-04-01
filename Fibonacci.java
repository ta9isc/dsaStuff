import java.util.*;
 class Fibonacci{
    public static int fib(int n){
        if( n < 2) return n; // Base case

        return fib(n - 2) + fib(n - 1); // reccurance relation
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}