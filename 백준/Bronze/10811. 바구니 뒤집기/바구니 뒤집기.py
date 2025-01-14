N, M = map(int, input().split())
li = [idx for idx in range(1, N + 1)]

for _ in range(M):
  i, j = map(int, input().split())
  li[i - 1:j] = reversed(li[i - 1:j])

print(*li)