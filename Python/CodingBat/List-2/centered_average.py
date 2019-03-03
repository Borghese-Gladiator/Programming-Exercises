def centered_average(nums):
  min = nums[0]
  max = nums[0]
  sum = 0
  divisor = 0
  for a in nums:
    if a < min:
      min = a
    if a > max:
      max = a
    divisor += 1
    sum += a
  sum -= max + min
  divisor -= 2
  if divisor >= 0:
    return sum/divisor
  else:
    return 0
  