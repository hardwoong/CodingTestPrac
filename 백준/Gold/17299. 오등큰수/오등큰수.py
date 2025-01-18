n = int(input())
nums = list(map(int, input().split()))
res = [-1] * n

max_num = max(nums)
freq = [0] * (max_num + 1)

for num in nums:
  freq[num] += 1

stack = []
for i in range(n):
  while stack and freq[nums[stack[-1]]] < freq[nums[i]]:
    res[stack.pop()] = nums[i]
  stack.append(i)

print(*res)
