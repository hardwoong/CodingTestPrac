li = []  
for _ in range(9):
    li.append(int(input()))

m = max(li)
print(m)

for i, value in enumerate(li):
  if value == m:
    print(i + 1)
