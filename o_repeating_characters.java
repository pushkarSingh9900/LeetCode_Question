import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet <Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = 0;
        while(right<n){
            if(!set.contains(ch[right])){
                set.add(ch[right]);
                max = Math.max(max, right-left+1);
                right++;
            }else{
                set.remove(ch[left]);
                left++;
            }
        }
        return max;
    }
}
