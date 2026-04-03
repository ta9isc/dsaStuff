import java.uitl.*;

public class HashMap1{
    public static boolean solve(String s, String t){
       if (s.length() != t.length()) return false;

       HashMap<Character, Integer>map = new HashMap<>();

       for (char c : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0) + 1);
       }

       for (char c : t.toCharArray()){
        if(!map.containsKey(c)) return false;

        map.put(c, map.get(c) - 1);

        if (map.get(c) == 0){
            map.remove(c);
        }
       }
       return map.isEmpty();
    }
}


/*

class Solution {
    static {
    for (int i = 0; i < 500; i++) {
        isAnagram("a", "");
    }
}
    public static boolean isAnagram(String s, String t) {
        int l = s.length();
        if(t.length()!=l) return false;
        int[] feq = new int[26];
        for(int i =0;i<l;i++){
            feq[s.charAt(i)-'a']++;
            feq[t.charAt(i)-'a']--;
        }
        for(int i =0;i<26;i++){
            if(feq[i]!=0) return false;
        }
        return true;
    }    
}
*/