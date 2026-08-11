// Last updated: 8/11/2026, 2:14:53 PM
import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[n];
        int maxCost = 0;

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            indegree[e[1]]++;
            maxCost = Math.max(maxCost, e[2]);
        }

        // Topological order
        Queue<Integer> q = new LinkedList<>();
        int[] topo = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            topo[idx++] = u;

            for (int[] e : graph[u]) {
                if (--indegree[e[0]] == 0) {
                    q.offer(e[0]);
                }
            }
        }

        int low = 0, high = maxCost;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long[] dist = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            dist[0] = 0;

            for (int i = 0; i < idx; i++) {
                int u = topo[i];
                if (dist[u] == Long.MAX_VALUE) continue;

                for (int[] e : graph[u]) {
                    int v = e[0];
                    int cost = e[1];

                    if (cost < mid) continue;
                    if (v != n - 1 && !online[v]) continue;

                    if (dist[u] + cost < dist[v]) {
                        dist[v] = dist[u] + cost;
                    }
                }
            }

            if (dist[n - 1] <= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}