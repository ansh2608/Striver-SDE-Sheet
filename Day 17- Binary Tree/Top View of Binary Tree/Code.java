import java.util.*;
public class Code {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static class Pair{
        Node node;
        int line;
        Pair(Node node,int line){
            this.node=node;
            this.line=line;
        }
    }
    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> m = new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            Node node = pair.node;
            int l = pair.line;
            if(!m.containsKey(l)) m.put(l,node.data);
            if(node.left!=null) q.offer(new Pair(node.left,l-1));
            if(node.right!=null) q.offer(new Pair(node.right,l+1));
        }
        for(Map.Entry<Integer,Integer> x : m.entrySet()) res.add(x.getValue());
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        System.out.println(topView(root));
    }
}
