import java.util.*;
import java.util.List;

public class SortedRotatedArray{
    public static void maxProfit(int[] prices) {
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE, idx = 0;
        for (int i = 0; i < prices.length; i++){
            if(mn > prices[i]){
                mn = prices[i];
                idx = i;
                System.out.println(idx);
            }
        }
        if(idx == prices.length - 1){ 
            System.out.println("Hello");
            return;}
        for (int i = idx; i < prices.length; i++){
            if(prices[i] > mx){
                mx = prices[i];
            }
        }

        System.out.println( mx - mn);
    }
    public static void main(String args[]){
       // ArrayList<Integer>l = new ArrayList<>(Arrays.asList(7, 1, 5, 3, 6, 4));
       int [] arr = {7, 1, 5, 3, 6, 4};
       maxProfit(arr);
    }
}