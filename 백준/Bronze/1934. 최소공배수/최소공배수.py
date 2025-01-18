import sys

def gcd(a, b):
  if b == 0:
    return a
  else:
    return gcd(b, a % b)

t = int(sys.stdin.readline())
for _ in range(t):
  a, b = map(int, sys.stdin.readline().split())
  sys.stdout.write(str((a * b) // gcd(a, b)) + "\n")