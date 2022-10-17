import java.util.*;
public class Main {

    public static class Edge{
        int src;
        int nbr;
        Edge(int src , int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nvtces = scn.nextInt(); // first thig passed
        ArrayList<Edge>[] graph = new ArrayList[nvtces];
        // above array would have default value of null in all blocks
        // initialize with empty ararylist
        for(int i = 0 ; i < nvtces ; i++){
            graph[i] = new ArrayList<>();
        }
        int nedges = scn.nextInt();
        for(int i = 1 ; i <= nedges ; i++){
            int v1 = scn.nextInt() , v2 = scn.nextInt();
            graph[v1].add(new Edge(v1 , v2));
            graph[v2].add(new Edge(v2 , v1));
        }
        scn.close();

        // printing
        for(ArrayList<Edge> list : graph){
            for(Edge edge : list){
                System.out.println(edge.src + "-->" + edge.nbr);
            }
        }

    }
}
