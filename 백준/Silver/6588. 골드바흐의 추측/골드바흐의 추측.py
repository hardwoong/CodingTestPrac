import sys

def era(n):
  isPrime = [True] * (n + 1)
  isPrime[0] = isPrime[1] = False
  for i in range(2, int(n**0.5)):
    if isPrime[i]:
      for j in range(i * i, n + 1, i):
        isPrime[j] = False
  return [x for x in range(n + 1) if isPrime[x]]

primes = set(era(1000000))  # 소수 리스트를 집합으로 변환

while True:
  n = int(sys.stdin.readline())
  if n == 0:
    break
  for i in range(n - 3, 2, -2):
    if i in primes and (n - i) in primes:
      print(f'{n} = {n - i} + {i}')
      break
  else:
    print('"Goldbach\'s conjecture is wrong."')