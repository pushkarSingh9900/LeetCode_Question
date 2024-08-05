class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        recursive(res, ds, nums,0);
        return res;
    }
    public void recursive(List<List<Integer>> res, List<Integer> ds, int[] nums, int start){
        res.add(new ArrayList<>(ds));
        for(int i=start; i<nums.length; i++){
            ds.add(nums[i]);
            recursive(res, ds, nums,i+1);
            ds.remove(ds.size()-1);
        }
    }
}
