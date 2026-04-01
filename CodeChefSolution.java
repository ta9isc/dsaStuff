import java.util.*;
public class CodeChefSolution{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] a= new int[n];
            for (int i = 0;i < n; i++){
                a[i] = sc.nextInt();
            }
            int cnt = 0;
            HashMap<Integer, Integer>map = new HashMap<>();
            for (int i = 0;i < n; i++){
                int val = a[i] - i;
                if(map.containsKey(val)){
                    cnt += map.get(val);
                    map.put(val, map.get(val) + 1);
                }
                else{
                    map.put(val, 1);
                }
            }
            System.out.println(cnt);
            t -= 1;
        }
    }
}
