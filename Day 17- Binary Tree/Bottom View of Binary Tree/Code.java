import java.util.*;

public class Code {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static ArrayList<Integer> bottomView(Node root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0)); 
        while(!q.isEmpty()){
            Pair cur = q.remove();
            map.put(cur.hd,cur.node.data);
            if(cur.node.left!=null) q.add(new Pair(cur.node.left,cur.hd-1));
            if(cur.node.right!=null) q.add(new Pair(cur.node.right,cur.hd+1));
        }
        ArrayList<Integer> list =new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) list.add(entry.getValue());
        return list;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);
        System.out.println(bottomView(root));
    }    
}
