import java.util.*;

public class Palindrome{
    public static boolean isPal(String s){
          s = s.toLowerCase();

        char[] a = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                a[k] = s.charAt(i); k++;
            }
        }
        for (int i = 0; i <= k; i++){
            System.out.print(a[i]);
        }

        

    int i = 0, j = k;

    while(i <= j){
        if(a[i] != a[j]){
            System.out.println(a[i] + " " + a[j]);
            return false;
        }
    
        i++; j--;
    }
    return true;
    }
    public static void main(String args[]){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        if(isPal(s)){
            System.out.println(" \n YES");
        }
        else {
            System.out.println(" \n NO");
        }
    }
}