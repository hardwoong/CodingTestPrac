N, M = map(int, input().split())
li = []
for idx in range(N):
  li.append(idx + 1)

for _ in range(M):
  i, j = map(int, input().split())
  tmp = li[i-1]
  li[i-1] = li[j-1]
  li[j-1] = tmp

print(*li)
