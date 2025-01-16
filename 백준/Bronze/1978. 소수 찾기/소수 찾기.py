n = int(input())
li = list(map(int, input().split()))
cnt = 0
for num in li:
  if num == 1:
    continue
  for x in range(2, num):
    if num % x == 0:
      break
  else:
    cnt += 1
print(cnt)