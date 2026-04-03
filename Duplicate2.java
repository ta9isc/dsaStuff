import java.util.*;
class Duplicate2{
    // public static boolean isEql(String){
    //     for (int i = 0; i < 4; i++){
    //         if(s1.charAt(i) != s2.charAt(i)) return false;
    //     }
    //     return true;
    // }
    public static boolean solve(String s1, String s2){
    //     Set<Integer>s = new HashSet<>();

    //     int n = a.length;
    //    for(int i = 0; i < n; i++){
    //     if(s.contains(a[i])) return true;

    //     s.add(a[i]);

    //     if(s.size() > k){
    //         s.remove(a[i - k]);
    //     }
    //    }
    //    return false;

int j;
   for (int i = 0; i < 4; i++){
    if(s1.equals(s2)) return true;
    j = i + 2;
    if(s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)){
        char temp = s1.charAt(i);
        s1.charAt(i) = s1.charAt(j);
        s2.charAt(j) = temp;
    }
   }
    return false;
    }

    public static void main(){
       Scanner sc = new Scanner(System.in);
       String s1, s2;
       s1 =sc.next();
       s2 = sc.next();

        System.out.println(solve(s1, s2));
    }
}