import java.util.*;
import java.util.List;
public class Recursion1 {
    public  static List<List<Integer>>subsets(List<List<Integer>>ans, List<Integer>ds, int[]nums, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        ds.add(nums[idx]);
        subsets(ans, ds, nums, idx + 1);
        ds.remove(ds.size() - 1);
        subsets(ans, ds, nums, idx + 1);
        return ans;

    }
    public static void main(String[] args){
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds = new ArrayList<>();
        int[] nums = {1, 2, 3};
        int idx = 0;
        subsets(ans, ds, nums, idx);
        System.out.println(ans.toString());
    }
}
