import java.util.List;
import java.util.*;
 class Fibonacci{
   
    public static void main(String args[]){
       int[] arr = {1, 2, 3, 4};
       List<Integer>ds = new ArrayList<>();
       int ans = 0, i = 0;
       System.out.println(subsets(ds, ans, i, arr));
    }
    public static int subsets(List<Integer>ds, int ans, int i, int [] arr){
        if(i == arr.length - 1){
          if(ds.size() == 3) { 
            ans+=1;
          }
          return ans;w
        }

        ds.add(arr[i]);
       return  subsets(ds, ans, i + 1, arr);
        ds.remove(ds.size() - 1);
       return  subsets(ds, ans, i + 1, arr);
    }
}