import java.util.*;
public class Bruteforce {
    public static boolean graphColoring(boolean graph[][], int m, int n) {
        List<Integer>[] adjList=new ArrayList[n];
        for(int i=0;i<n;i++) adjList[i]=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]){
                    adjList[i].add(j);
                    adjList[j].add(i);
                }
            }
        }
        return graphColor(adjList,new int[n],0,m);
    }
    public static boolean graphColor(List<Integer>[] adjList,int[] color,int node,int c){
        if(node==color.length) return true;
        for(int i=1;i<=c;i++){
            if(isSafe(node,adjList,color,i)){
                color[node]=i;
                if(graphColor(adjList,color,node+1,c)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int node,List<Integer>[] adjList,int[] color,int c){
        for(int i:adjList[node]) if(color[i]==c) return false;
        return true;
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        boolean[][] G = new boolean[N][N];
        G[0][1]=true;
        G[1][0]=true;
        G[1][2]=true;
        G[2][1]=true;
        G[2][3]=true;
        G[3][2]=true;
        G[3][0]=true;
        G[0][3]=true;
        G[2][0]=true;
        G[0][2]=true;
        System.out.println(graphColoring(G, M, N));
    }
}
