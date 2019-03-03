def sum13(nums):
  if len(nums) == 0:
    return 0
  sum = 0
  after = False
  for a in nums:
    if after:
      after = False
      continue
    if a == 13:
      after = True
      continue
    sum += a
  return sum
