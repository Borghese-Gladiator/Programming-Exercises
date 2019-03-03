def end_other(a, b):
  a = a.lower()
  b = b.lower()
  if len(a) > len(b):
    return b == a[-len(b): len(a)]
  elif len(a) < len(b):
    return a == b[-len(a): len(b)]
  else:
    return a == b