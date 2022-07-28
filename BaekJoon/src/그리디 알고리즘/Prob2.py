def check(arr, last, m):
    # 만약 마지막 꺼보다 같거나 뒤에 있으면
    if arr[m][0] >= last:
        last = arr[m][0]
        count += 1
        check(arr, last, m+1)
    elif arr[m]

    else:
        check(arr, last, m+1)




num = int(input())
arr = []
global count
for i in range(num):
    a, b = map(int, input().split())
    arr.append([a, b])
arr = sorted(arr)
#어떤 것이 첫 번째가 될지 (끝나는 조건은 만약 선택된 것 앞에 들어갈 게 있으면 종료)
for m in range(num):
    count = 0
    n = 0
    # 첫번째꺼 고정
    first = arr[m][0]
    # 마지막 임시 고정
    last = arr[m][1]
    check(arr, last, m)
           # 종료 조건

    last = arr[m][1]
    n = 0
        n += 1
        # 다음꺼 고정
        if(arr[m][0] arr[m+n][0])
        # # 다음꺼 고정
        # for l in range(m, n):
        #     if arr[l+1][0] <= arr[l][1]:
        #         count += 1
        #         last = arr[l+1][0]
print(arr)