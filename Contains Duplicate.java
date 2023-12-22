class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean ret = false;

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else {
                ret = true;
                break;
            }

        }
        return ret;

    }
}