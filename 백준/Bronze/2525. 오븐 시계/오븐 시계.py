h, m = map(int, input().split())
p = int(input())

m += p

while m >= 60:
  m -= 60
  h += 1
  
if h >= 24:
  h -= 24

print(h, m)