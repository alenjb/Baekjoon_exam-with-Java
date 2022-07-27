n, k = map(int, input().split())
arr = []
count = 0
for i in range(n):
    arr.append(int(input()))
for j in range(n-1, -1, -1):
    l = k // arr[j]
    k = k - l * arr[j]
    count += l
print(count)

# for j in range(5, 1, -1):
#     print(j)
