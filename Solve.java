import java.util.*;
class Solve{
    public static void solve(int[]a){
        HashMap<Integer, Integer>map = new HashMap<>();
        for (int i = 0; i < a.length; i++){
            // int key = i;
            // int valude = i - a[i];
            // map[key] = value;
            map.put(i, i - a[i]);
        }
        System.out.println(map);
    }
    public static void main(String args[]){

        int[] a = {1, 1, 3, 3, 4};
       
        solve(a);
    }
}