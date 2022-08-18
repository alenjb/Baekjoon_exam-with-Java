from collections import deque

n = int(input())
line = int(input())
graph = [[] for i in range(n+1)]
visited = [False] * (n+1)
cnt = 0

for i in range(line):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def bfs(graph, v):
    global cnt
    queue = deque([v])

    while queue:
        pop = queue.popleft()
        visited[pop] = True

        for i in graph[pop]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)
                cnt += 1
    print(cnt)


bfs(graph, 1)
