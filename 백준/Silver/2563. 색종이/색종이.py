n = int(input())
li = [list(map(int, input().split())) for _ in range(n)]

white = [[0] * 100 for _ in range(100)]

for x, y in li:
  for i in range(x, x + 10):
    for j in range(y, y + 10):
      white[i][j] = 1
      
vol = sum(sum(row) for row in white)
print(vol)