import java.util.*;

public class NoOfSteps {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(f(num, 1));
    }
    public static int f(int num, int st){
        if(num == 1) return st;

        if(num % 2 != 0){
            return f(num - 1, st + 1);
        }
        else{
            return f(num/2, st + 1);
        }
    }
}
