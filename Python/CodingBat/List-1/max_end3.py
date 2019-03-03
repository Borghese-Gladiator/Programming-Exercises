def max_end3(nums):
  larger = max(nums[0], nums[2])
  nums[0] = larger
  nums[1] = larger
  nums[2] = larger
  return nums