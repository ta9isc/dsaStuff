import java.util.*;

public class readKeyboard{
    public static int fib(int n){
        if(n == 0 || n == 1) return n;


        return fib(n - 1) + fib(n - 2);
    }
    public static void main(){

        System.out.println("Enter the number :");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(fib(n));

    }
}