public int countX(String str) 
{
  if (str.isEmpty())
  {
    return 0;
  }
  else if (str.charAt(0) == 'x')
  {
    return countX(str.substring(1)) + 1;
  }
  else
  {
    return countX(str.substring(1));
  }
  
}
