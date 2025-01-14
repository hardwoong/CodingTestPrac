inp = input()
dial = {
  'ABC': 3, 'DEF': 4, 'GHI': 5,
  'JKL': 6, 'MNO': 7, 'PQRS': 8,
  'TUV': 9, 'WXYZ': 10
}

total_time = 0
for char in inp:
  for key in dial:
    if char in key:  # 현재 문자가 해당 다이얼 그룹에 포함되면
      total_time += dial[key]
      break

print(total_time)
