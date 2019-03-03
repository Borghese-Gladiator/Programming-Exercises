def big_diff(nums):
  min = nums[0]
  max = nums[0]
  for a in nums:
    if a < min:
      min = a
    if a > max:
      max = a
  return max - min
