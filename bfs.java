import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class bfs{
    
    public static void bfsTrav(List<List<Integer>>l, int V, int node){
        boolean[] vis = new boolean[V + 1];

        Queue<Integer>q = new ArrayDeque<>();
        q.offer(node);
        vis[node] = true;
        while(q.size() > 0){
            int nod = q.poll();
            System.out.print(nod + " ");
           for (int it : l.get(nod)){
            if(vis[it] == false){
                q.offer(it);
                vis[it] = true;
            }
           }
           
        }
    }
    public static void addEdge(List<List<Integer>>l, int u, int v){
        l.get(u).add(v);
        l.get(v).add(u);
    }
    public static void main(String args[]){
       // List<List<Integer>>l = new ArrayList<>();
        int V = 7;
      //  Scanner sc = new Scanner(System.in);
       // V = sc.nextInt();
       List<List<Integer>>l = new ArrayList<>();
       for (int i = 0; i <= V; i++){
        l.add(new ArrayList<>());
       }
    addEdge(l, 1, 2);
    addEdge(l, 2, 1);
    addEdge(l, 2, 3);
    addEdge(l, 2, 4);
    addEdge(l, 3, 2);
    addEdge(l, 3, 5);
    addEdge(l, 4, 2);
    addEdge(l, 4, 5);
    addEdge(l, 5, 3);
    addEdge(l, 5, 4);
    addEdge(l, 5, 6);

       bfsTrav(l, V, 1);
    }
}