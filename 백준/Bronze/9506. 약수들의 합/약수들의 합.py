while True:
  n = int(input())
  if n == -1:
    break
  li = []
  for i in range(1, n):
    if n % i == 0:
      li.append(i)
  if sum(li) == n:
    print(n, end=' = ')
    for i in range(len(li)):
      print(li[i], end=' ')
      if i + 1 != len(li):
        print('+', end=' ')
    print()
  else:
    print(f'{n} is NOT perfect.')