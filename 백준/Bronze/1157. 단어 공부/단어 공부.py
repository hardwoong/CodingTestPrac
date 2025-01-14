word = input().lower()
li = [0] * 26
for x in word:
  li[ord(x) - 97] += 1

if li.count(max(li)) > 1:
  print("?")
else:
  print(chr(li.index(max(li)) + 65))