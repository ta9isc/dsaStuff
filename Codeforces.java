import java.util.*;
public class Codeforces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();
            int a = 0, b = 0, c = 0, d = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 'A') a++;
                if(arr[i] == 'B') b++;
                if (arr[i] == 'C') c++;
                if (arr[i] == 'D') d++;
            }
            int ans = 0;

            if(a >= n){
                ans += n;
            }
            else{
                ans += a;
            }
            if (b >= n){
                ans += n;
            }
            else{
                ans += b;
            }
            if (c >= n){
                ans += n;
            }
            else{
                ans += c;
            }
            if (d >= n){
                ans += n;
            }
            else{
                ans += d;
            }
            System.out.println(ans);
            t-=1;
        }
    }
}