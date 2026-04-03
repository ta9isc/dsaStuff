import java.util.*;
// import java.util.ArrayList;
// import java.util.ArrayDeque;
// import java.util.List;

public class bfs1{

    public static void bfsTrav(List<List<Integer>> l, int V, int node) {
        boolean[] vis = new boolean[V + 1];

        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        vis[node] = true;

        while (!q.isEmpty()) {
            int nod = q.poll();
            System.out.print(nod + " ");

            for (int it : l.get(nod)) {
                if (!vis[it]) {
                    q.offer(it);
                    vis[it] = true;
                }
            }
        }
    }

    public static void addEdge(List<List<Integer>> l, int u, int v) {
        l.get(u).add(v);
        l.get(v).add(u);
    }

    public static void main(String args[]) {
        int V = 7;

        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            l.add(new ArrayList<>());
        }

        addEdge(l, 1, 2);
        addEdge(l, 2, 3);
        addEdge(l, 2, 4);
        addEdge(l, 3, 5);
        addEdge(l, 4, 5);
        addEdge(l, 5, 6);

        bfsTrav(l, V, 1);
    }
}
