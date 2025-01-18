word = list(input())
stack = []
isTag = False

for i in range(len(word)):
  if word[i] == '<': 
    isTag = True
    while stack:
      print(stack.pop(), end='')
    print(word[i], end='')  
  elif word[i] == '>':  
    isTag = False
    print(word[i], end='')  
  elif isTag:  
    print(word[i], end='')  
  elif word[i] == ' ':  
    while stack:
      print(stack.pop(), end='')
    print(' ', end='')
  else:
    stack.append(word[i])

while stack:
  print(stack.pop(), end='')
