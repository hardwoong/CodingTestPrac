mat = [[0] * 9 for _ in range(9)]
for i in range(9):
  mat[i] = list(map(int, input().split()))

m = -float('inf')  # 최소값으로 초기화
row = 0
col = 0

for i in range(9):
  for j in range(9):
    if m < mat[i][j]:  # 최대값 갱신
      m = mat[i][j]
      row = i + 1  # 행 번호 (1-based)
      col = j + 1  # 열 번호 (1-based)

print(m)
print(row, col)
