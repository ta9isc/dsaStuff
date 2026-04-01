import java.util.*;
import java.util.List;
public class RichestCustomer{
    public  static void  solve(int[] candies, int extraCandies) {
       int mx = 0;
        for (int i = 0; i < candies.length; i++){
            if(candies[i] > mx){
                mx = candies[i];
            }
        }
        System.out.println("max" + mx);
        ArrayList<Boolean>l = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= mx){
                l.add(true);

                System.out.println("candies " + candies[i] + extraCandies);
            }
            else if(candies[i] + extraCandies < mx){
                l.add(false);
            }

        }
       System.out.println(l.toString());
       
    }
    public static void main(String args[]){
        int[] arr = {2, 3, 5, 1, 3};
       
        solve(arr, 3);

       
    }
}