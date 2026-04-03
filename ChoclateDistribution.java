import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class ChoclateDistribution{
    public static int distribute(List<Integer>l, int m){
        Collections.sort(l);
        int mn = Integer.MAX_VALUE;
        for (int i = 0;  i <= l.size()  - m ; i++){
            int diff = l.get(i + m - 1) - l.get(i);
           mn = Math.min(mn, diff);
           

        }

        return mn;
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n , m;
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<Integer>l = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            l.add(x);
        }

        System.out.println(distribute(l, m));
    }
}


/*
8 5
3 4 1 9 56 7 9 12
*/