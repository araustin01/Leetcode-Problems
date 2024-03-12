class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();

        // build map
        for(int i = 0; i < nums.length; i++)
            arrayMap.put(nums[i], i);

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // calculate required complement
            int cI; // complement index
            if ((cI = arrayMap.getOrDefault(diff, -1)) != -1 && cI != i)
                return new int[]{ i, cI };
        }

        return new int[] { -1, -1 };
    }
}