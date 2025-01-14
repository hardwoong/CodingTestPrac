N = int(input())
num = input()
sum = 0
for i in range(1, len(num) + 1):
  sum += int(num[i - 1])

print(sum)