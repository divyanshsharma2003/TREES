// Checking if a binary tree is Balaced.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
public class balancedTree{
    static int height(TreeNode root){
        if(root == null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh == -1 || rh == -1)return -1;
        if(Math.abs(lh-rh) > 1)return -1;
        return 1+Math.max(lh, rh);
    }
    static boolean isBalanced(TreeNode root){
        return height(root) != -1;
    }
    public static void main(String [] args){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        root.left = n1;
        root.right = n2;
        n1.right = new TreeNode(3);
        TreeNode n3 = new TreeNode(3);
        n1.left = n3;
        n3.left = new TreeNode(4);
        n3.right = new TreeNode(4);
        System.out.println("Is Balanced ? : "+isBalanced(root));
    }
 }