N = int(input())
li = list(map(int, input().split()))
scores = [(x / max(li)) * 100 for x in li]
print(sum(scores) / len(scores))