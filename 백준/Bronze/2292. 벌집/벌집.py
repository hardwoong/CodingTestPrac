N = int(input())
start = 1
cnt = 1
while start < N:
  start += 6 * cnt
  cnt += 1
  
print(cnt)