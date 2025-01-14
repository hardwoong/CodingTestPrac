T = int(input())
for _ in range(T):
  R, S = input().split()
  R = int(R)
  for i in range(len(S)):
    for _ in range(R):
      print(S[i], end='')
  print()