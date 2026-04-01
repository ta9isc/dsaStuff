import java.util.*;
public class CF1971A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int x , y;
            x = sc.nextInt();
            y = sc.nextInt();

            System.out.println( Math.min(x, y)+ " " + Math.max(x, y));
            t -= 1;
        }
    }
}