public int count8(int n) 
{
  if (n == 0)
  {
    return 0;
  }
  else if (n % 10 == 8)
  {
    if (n / 10 % 10 == 8)
    {
      return count8(n /10) + 2;
    }
    return count8(n / 10) + 1;
  }
  else
  {
    return count8(n / 10);
  }
}
