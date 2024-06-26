import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        char[] charArray = a.toCharArray();
        Stack <Character> arr = new Stack<>();

        for(char c: charArray){
            arr.push(c);
        }
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] != arr.pop()){
                return false;
            }
        }
        return true;
    }
}
