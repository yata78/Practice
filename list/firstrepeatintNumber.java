package list;

import java.util.*;

class Solution{
    public static int firstRepeatingNumber(int[] nums){
        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(numsMap.get(nums[i]) == null){
                numsMap.put(nums[i], 1);
            } else {
                numsMap.replace(nums[i], numsMap.get(nums[i]) + 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(numsMap.get(nums[i]) > 1){
                return nums[i];
            }
        }

        return -1;
    }
}
