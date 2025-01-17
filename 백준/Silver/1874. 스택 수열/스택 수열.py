nums = []
res = []
cur = 1

t = int(input())

for _ in range(t):
  n = int(input())
  while cur <= n:
    nums.append(cur)
    res.append('+')
    cur += 1
  if n == nums[-1]:
    res.append('-')
    nums.pop()
  else:
    print('NO')
    break
else:
  print("\n".join(res))