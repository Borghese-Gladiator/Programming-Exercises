public boolean splitOdd10(int[] nums) {
  return splitArrayRec(nums, 0, 0, 0);
}
public boolean splitArrayRec(int[] nums, int i, int group1, int group2) {
  if (i >= nums.length) {
    return group1 % 10 == 0 && group2 % 2 == 1;
  }
  if (splitArrayRec(nums, i + 1, group1 + nums[i], group2)) {
    return true;
  }
  if (splitArrayRec(nums, i + 1, group1, group2 + nums[i])) {
    return true;
  }
  return false;
}