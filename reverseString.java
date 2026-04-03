import java.util.*;

public class reverseString{
    public static StringBuilder revStr(StringBuilder s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            char temp;
            temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++; j--;
            
        }
        return s;
    }
    public static void main(String args[]){
        System.out.println("Enter string to reverse : ");
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        System.out.println("The reversed string is :" + revStr(sb));
    }
}