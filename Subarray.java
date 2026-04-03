import java.util.*;
import java.util.List;

public class Subarray{
    public static int sumEqualsK(int []nums, int t){
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n; i++){
            int j = i, s = 0;
            while (j < n){
          //      System.out.println(nums[j]);
                s += nums[j];
                if(s > t){
                    break;
                }
                if(s == t) cnt++;
                j++;
            }
        }
        return cnt;
    }
    public static void main(){
        int n, target;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        target = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumEqualsK(arr, target));
    }
}