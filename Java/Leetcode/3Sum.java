class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        for (int i = nums.length - 1; i >= 2; i--) {
            int target = -nums[i];
            //if targets are equal
            if(i < nums.length - 1 && target == -nums[i+1]) {
                continue;
            }
            int left = 0;
            int right = i - 1;
            twoSum(nums, target, left, right, ans);
        }
        return ans;
    }
    public void twoSum(int[] nums, int target, int left, int right, List<List<Integer>> ans)
    {
        //ans will retain changes
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> temp = new ArrayList();
                temp.add(nums[left]);
                temp.add(nums[right]);
                temp.add(-target);
                ans.add(temp);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}