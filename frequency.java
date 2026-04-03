import java.util.*;

class frequency{
    public static int countFreq(int[] nums){
        HashMap<Integer, Integer>freq = new HashMap<>();

        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int ans = -1;
        for (int key : freq.keySet()){
            if (freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ans = key;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int [] nums = {1, 2, 3, 1, 1, 2, 2, 2, 3, 3, 2, 1};

        System.out.println(countFreq(nums));
    }
    }