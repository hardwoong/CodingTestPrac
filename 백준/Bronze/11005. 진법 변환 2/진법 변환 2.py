N, B = map(int, input().split())

numList = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
res = ''
while N > 0:
  res = numList[N % B] + res
  N //= B
print(res)