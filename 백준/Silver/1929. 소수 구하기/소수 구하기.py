m, n = map(int, input().split())

def era(n):
  isPrime = [True] * (n + 1)
  isPrime[0] = isPrime[1] = False
  for i in range(2, int(n**0.5) + 1):
    if isPrime[i]:
      for j in range(i * i, n + 1, i):
        isPrime[j] = False
  return [x for x in range(n + 1) if isPrime[x]]

primes = era(n)
for p in primes:
  if p >= m:
    print(p)