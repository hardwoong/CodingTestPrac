N, M = map(int, input().split())

mat1 = [[0] * M for _ in range(N)]
mat2 = [[0] * M for _ in range(N)]

for i in range(N):
  mat1[i] = list(map(int, input().split()))
for i in range(N):
  mat2[i] = list(map(int, input().split()))

for i in range(N):
  for j in range(M):
    print(mat1[i][j] + mat2[i][j], end=' ')
  print()