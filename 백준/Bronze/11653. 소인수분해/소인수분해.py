n = int(input())
nums = []
idx = 2
while idx * idx <= n:
    while n % idx == 0:
      n //= idx
      nums.append(idx)
    idx += 1
if n > 1:  
  nums.append(n)
print(*nums, sep='\n')
