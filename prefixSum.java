import java.util.*;

public class static int linearSearch(int[])

    public static void main(String arg[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];

       for (int i = 0; i < n; i++){
        a[i] = sc.nextInt();
       }
       int prefSum = a[0];
       int[] b =  new int[n];
       b[0] = a[0];

       for (int i = 1; i < n; i++){
        b[i] = prefSum + a[i];
       }

       for (int i = 0; i < n; i++){
        System.out.print(b[i] + " "); 
          }

        
    }
}