global arr
global num
global cnt

def add(last1, m1, count1):
    # print("-------------------")
    # print(m1, "일단 여기서 시작 카운트는", count1, " 다음거는 ",arr[m1][0], "~", arr[m1][1])
    # print("m1 ", m1, "last1", last1, "num:",num)
    # print("반복문 검출", last1 >= max(arr[c][0] for c in range(m1, num)))
    if (m1 == num-1) or (last1 > max(arr[c][0] for c in range(m1, num))):
        count1 += 1

        cnt.append(count1)
        return
    elif last1 <= arr[m1][0]:
        # print("앞에 마지막: ", last1)
        last1 = arr[m1][1]
        # print("연결 뒤:", arr[m1][0], last1)
        for c in range(m1+1, num):
            add(last1, m1+1, count1+1)
    else:
        add(last1, m1+1, count1)


num = int(input())
arr = []
cnt=[]
for i in range(num):
    a, b = map(int, input().split())
    arr.append([a, b])
arr = sorted(arr)
for m in range(num-1):
    count = 1
    last = arr[m][1]
    add(last, m+1, count)
print(max(cnt))
# count = 1
# last = arr[0][1]
# add(last, 0+1, count)