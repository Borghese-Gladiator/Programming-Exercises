public int factorial(int n) 
{
  if (n < 2)
  {
    return n;
  }
  else
  {
    return factorial(n - 1) * n;
  }
  
}
