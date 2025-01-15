li = [list(input()) for _ in range(5)]

maxRow = max(len(row) for row in li)

for i in range(maxRow):
  for j in range(5):
    if i < len(li[j]):
      print(li[j][i], end='')