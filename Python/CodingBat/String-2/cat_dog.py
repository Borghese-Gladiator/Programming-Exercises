def cat_dog(str):
  dogCount = 0
  catCount = 0
  for i in range(len(str)):
    temp = str[i:i + 3]
    if temp == "dog":
      dogCount += 1
    elif temp == "cat":
      catCount += 1
  return dogCount == catCount
