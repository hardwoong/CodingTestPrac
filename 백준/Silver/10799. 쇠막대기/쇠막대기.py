li = input()
idx = 0  # 열린 괄호의 개수
res = 0  # 결과값

for i in range(len(li)):
  if li[i] == '(':  # 열린 괄호
    idx += 1
  else:  # 닫힌 괄호
    idx -= 1
    if li[i - 1] == '(':  # 레이저
      res += idx
    else:  # 막대기의 끝
      res += 1

print(res)
