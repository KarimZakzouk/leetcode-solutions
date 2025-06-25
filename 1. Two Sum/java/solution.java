class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int newtarget = target - nums[i];
            if(numMap.containsKey(newtarget)){
                return new int[] {numMap.get(newtarget), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
}