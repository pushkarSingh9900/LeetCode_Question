class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],target-nums[i]);
            }
            else{
                res[0] = i;
                for(int j = 0; j<i; j++){
                    if(nums[j] == target - nums[i]){
                        res[1] = j;
                    }
                }
            }
        }
        return res;
    }
}
