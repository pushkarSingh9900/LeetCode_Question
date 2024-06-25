class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int left = 1;
        int right  = 1;
        for(int i = 0; i < n ; i++){
            output[i] = left;
            left *= nums[i];
        }
        for(int i = n-1 ; i >= 0 ; i--){
             output[i] *= right;
             right *= nums[i]; 
        }
        return output;
    }
}