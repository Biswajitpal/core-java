import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Tree {
    
    void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    
    void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
    void labelOrderTraversal(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
    
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(40);
        root.right.left = new TreeNode(33);
        // root.right.left.left = new TreeNode(330);
        root.right.right = new TreeNode(34);

        tree.labelOrderTraversal(root); // Output: 1 2 3 4 5
        
        /* System.out.println("Pre-order Traversal:");
        tree.preOrder(root); // Output: 1 2 4 5 3
        
        System.out.println("\nIn-order Traversal:");
        tree.inOrder(root); // Output: 4 2 5 1 3
        
        System.out.println("\nPost-order Traversal:");
        tree.postOrder(root); // Output: 4 5 2 3 1 */
    }
}
