def has22(nums):
  possibleTwo = False
  for a in nums:
    if possibleTwo and a == 2:
      return True
    else:
      possibleTwo = False
    if a == 2:
      possibleTwo = True
  return False