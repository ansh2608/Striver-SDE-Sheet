public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
        }
    }
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        if(root==null) return;
        if(root.data==key){
            if(root.left!=null){
                Node temp=root.left;
                while (temp.right!=null) temp=temp.right;
                suc[0]=temp;
            }
            if(root.right!=null){
                Node temp=root.right;
                while(temp.left!=null) temp=temp.left;
                pre[0]=temp;
            }
            return;
        }
        if(root.data>key){
            suc[0]=root;
            findPreSuc(root.left,pre,suc,key);
        }
        else{
            pre[0]=root;
            findPreSuc(root.right, pre, suc, key);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}