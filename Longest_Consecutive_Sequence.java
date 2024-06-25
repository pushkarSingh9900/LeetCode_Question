import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int count = 1;
                while(set.contains(currNum+1)){
                currNum++;
                count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
