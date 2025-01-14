S = input()
sp = [-1] * 26 

for i in range(len(S)):
  index = ord(S[i]) - 97 
  if sp[index] == -1:
    sp[index] = i

print(*sp)
