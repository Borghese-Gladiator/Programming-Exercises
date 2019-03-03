def count_evens(nums):
  count = 0
  for a in nums:
    if a % 2 == 0:
      count += 1
  return count
