public int bunnyEars2(int bunnies) 
{
  if (bunnies == 0)
  {
    return 0;
  }
  else if (bunnies % 2 == 1)
  {
    return bunnyEars2(bunnies - 1) + 2;
  }
  else
  {
    return bunnyEars2(bunnies - 1) + 3;
  }
}
