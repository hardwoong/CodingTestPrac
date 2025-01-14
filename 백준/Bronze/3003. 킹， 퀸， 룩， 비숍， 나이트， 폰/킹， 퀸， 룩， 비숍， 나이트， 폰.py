li = list(map(int, input().split()))
if li[0] != 1:
  li[0] = 1 - li[0]
else:
  li[0] = 0
if li[1] != 1:
  li[1] = 1 - li[1]
else:
  li[1] = 0
if li[2] != 2:
  li[2] = 2 - li[2]
else:
  li[2] = 0
if li[3] != 2:
  li[3] = 2 - li[3]
else:
  li[3] = 0
if li[4] != 2:
  li[4] = 2 - li[4]
else:
  li[4] = 0
if li[5] != 8:
  li[5] = 8 - li[5]
else:
  li[5] = 0
  
print(*li)