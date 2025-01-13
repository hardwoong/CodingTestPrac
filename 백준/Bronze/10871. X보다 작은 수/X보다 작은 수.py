N, X = map(int, input().split())
li = list(map(int, input().split()))
for i in range(0, len(li)):
  if X > li[i]:
    print(li[i], end=" ")