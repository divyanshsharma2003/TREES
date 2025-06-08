// import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class rep{

    static void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data+" -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if (root == null)return;
        inOrder(root.left);
        System.out.print(root.data+" -> ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" -> ");

    }
    // LEVEL ORDER IN LEETCODE -> 102
    public static void main (String [] args){
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

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}