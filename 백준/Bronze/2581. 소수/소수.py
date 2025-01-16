n = int(input())
m = int(input())

nums = []

for i in range(n, m + 1):
  if i == 1:
    continue
  for x in range(2, i):
    if i % x == 0:
      break
  else:
    nums.append(i)
if len(nums) == 0:
  print(-1)
else:
  print(sum(nums))
  print(nums[0])