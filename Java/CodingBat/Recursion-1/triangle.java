public int triangle(int rows) 
{
  if (rows < 2)
  {
    return rows;
  }
  return triangle(rows - 1) + rows;
  
}
