t = int(input())
for _ in range(t):
  vps = input()
  cnt = 0
  for i in range(len(vps)):
    if vps[i] == '(':
      cnt += 1
    elif vps[i] == ')':
      cnt -= 1
      if cnt < 0:
        break
  if cnt == 0:
    print('YES')
  else:
    print('NO')