def rotate_left3(nums):
  return rotate(nums, 1)
def rotate(nums, n):
  return nums[n:] + nums[:n]
