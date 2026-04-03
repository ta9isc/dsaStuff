import java.util.*;

public class ValidAnagram{
   public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char[] arr1 =  s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       
        System.out.println(sortedS);
        System.out.println(sortedT);
       for (int i = 0; i < s.length(); i++){
        if(sortedS.charAt(i) != sortedT.charAt(i)) return false;
       }
       return true;
    }


    public static void main(String args[]){
    String s, t;

    Scanner sc = new Scanner(System.in); 
    s = sc.next();
    t = sc.next();

    if(isAnagram(s, t)){
        System.out.println("YES");
    }
    else {
        System.out.println("NO");
    }

}
}