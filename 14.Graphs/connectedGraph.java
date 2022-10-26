import java.io.*;
import java.util.*;

public class connectedGraph {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      ArrayList<ArrayList<Integer>> comps = getAllComponents(graph);
      
      // write your code here
      

      System.out.println(comps);
   }

   public static ArrayList<ArrayList<Integer>> getAllComponents(ArrayList<Edge>[] graph){
      boolean[] vis = new boolean[graph.length];
      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      for(int i = 0 ; i < vis.length ; i++){
         if(vis[i] == false){
            ArrayList<Integer> comps = new ArrayList<>();
            getComponent(graph , vis , i , comps);
            ans.add(comps);
         }
      }
      return ans;
   }

   public static void getComponent(ArrayList<Edge>[] graph , boolean[] vis, int src , ArrayList<Integer> comps){
      vis[src] = true;
      comps.add(src);

      for(Edge e : graph[src]){
         if(vis[e.nbr] == false){
            getComponent(graph , vis , e.nbr , comps);
         }
      }
   }
}