from collections import deque

num = int(input())
net = int(input())


def bfs(x):
    queue = deque()
    queue.append(x)
    while queue:
        x, y = queue.pop()
        # print(x, y)
        answer.append(x)
        answer.append(y)
        for k in graph:
            if (x in k or y in k) and not (k in arr):
                arr.append(k)
                # graph.remove(k)
                bfs(k)


    # print(queue)

arr =[]
graph = []
answer = []
# 리스트에 저장하고
for i in range(net):
    a, b = map(int, input().split())
    graph.append((a, b))
graph.sort()
bfs(graph[0])

answer = set(answer)
# print(answer)
print(len(answer)-1)
# for j in range(1, num+1):
#     for k in graph:
#         if j == k[0]:
#             bfs(k)

# 큐에 넣어서 하나씩 뺴면서
    # 1과 닿으면 그 수를 감염 리스트에 넣고
    #감염 리스트에 있는 수가 있으면 감염리스트에 추가