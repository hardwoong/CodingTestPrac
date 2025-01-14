wordList = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = input()
for w in wordList:
  word = word.replace(w, '@')
  
print(len(word))