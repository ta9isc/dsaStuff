import java.util.*;
public  class PowerOfTwo {
    public  static boolean fn(int n){
        if(n <= 0) return false;
        if (n == 1) return true;
        if(n % 2 != 0) return false;

        return fn(n/2);
    }

    // main function to check 
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(fn(n)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}