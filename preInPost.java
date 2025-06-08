import java.util.*;

class pair{
    Node node;
    int num;
    pair(Node node, int num){
        this.node = node;
        this.num = num;
    } 
}
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class preInPost {

    static void print(List<Integer> lst){
        System.out.println(lst.toString());
    }

    static void traverseInOne(Node root){
        Stack<pair> st = new Stack<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if(root== null)return;
        st.push(new pair(root,1));
        while(!st.isEmpty()){
            pair p = st.pop();

            if(p.num == 1){
                pre.add(p.node.val);
                p.num++;
                st.push(p);
                if(p.node.left != null)st.push(new pair(p.node.left, 1));
            }
            else if (p.num == 2){
                in.add(p.node.val);
                p.num++;
                st.push(p);
                if(p.node.right != null)st.push(new pair(p.node.right, 1));
            }
            else{
                post.add(p.node.val);
            }
        }
        System.out.println("Pre-Order : ");
        print(pre);
        System.out.println("In-Order : ");
        print(in);
        System.out.println("Post-Order : ");
        print(post);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        root.left = n1;
        root.right = n2;
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        n1.left = n3;
        n1.right = n4;
        Node n5 = new Node(7);
        Node n6 = new Node(8);
        n2.left = n5;
        n2.right = n6;
        n4.left = new Node(6);
        n6.left = new Node(9);
        n6.right = new Node(10);
        traverseInOne(root);
    }
}
