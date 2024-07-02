import java.util.*;
class Solution {

    public boolean isAnagram(String s, String t) {
        String splitS[] = s.split(""); 
        String splitT[] = t.split("");
        Arrays.sort(splitS);
        Arrays.sort(splitT);
        return Arrays.equals(splitS,splitT);
    }
}