import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
      HashMap<String, Integer> map = new HashMap<>();
      map.put("I", 1);  
      map.put("V", 5); 
      map.put("X", 10); 
      map.put("L", 50); 
      map.put("C", 100); 
      map.put("D", 500); 
      map.put("M", 1000);
      char[] ch = s.toCharArray();
      int res = 0;
      for(int i = 0; i < ch.length; i++){
        if(i+1<ch.length && map.get(String.valueOf(ch[i])) < map.get(String.valueOf(ch[i+1]))){
            res -= map.get(String.valueOf(ch[i]));
        }else{
        res+= map.get(String.valueOf(ch[i]));
        }
      }
      return res;
    }
}
