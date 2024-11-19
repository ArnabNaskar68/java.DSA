//Depth-First Search & Breath-First Seacrh , height, node sum, total node count
//there is an error in the code syntax but the above operation logic implementation is correct
import java.util.Queue;
import java.util.LinkedList;

class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Tree {
        static int ind = -1;

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static int postorder(Node root) {
            if (root == null) return 0;
            int count = 1; // Count the current node
            count += postorder(root.left); // Add left subtree nodes
            count += postorder(root.right); // Add right subtree nodes
            System.out.println("Node is: " + root.data);
            return count;
        }

        public static void level_order(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode != null) {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                } else {
                    System.out.println(); // End of the current level
                    if (!q.isEmpty()) {
                        q.add(null); // Add marker for the next level
                    }
                }
            }
        }

        public static int count(Node root) { // Counts the total number of nodes
            if (root == null) {
                return 0;
            }
            return 1 + count(root.left) + count(root.right); // 1 for root + total nodes in left + total in right
        }

        public static int height(Node root) {
            if (root == null) return 0;
            return 1 + Math.max(height(root.left), height(root.right));
        }

        public static int sum(Node root) {
            if (root == null) return 0;
            return root.data + sum(root.left) + sum(root.right);
        }

        public static Node binary_tree(int[] node) {
            ind++;
            if (ind >= node.length || node[ind] == -1) {
                return null;
            }
            Node new_node = new Node(node[ind]);
            new_node.left = binary_tree(node);
            new_node.right = binary_tree(node);
            return new_node;
        }
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = Tree.binary_tree(node);

        System.out.println("Root of the tree: " + root.data);

        System.out.println("Postorder Traversal:");
        int nodeCount = Tree.postorder(root);
        System.out.println("Total nodes (via postorder): " + nodeCount);

        System.out.println("Level Order Traversal:");
        Tree.level_order(root);

        int totalCount = Tree.count(root);
        System.out.println("Total Node Count: " + totalCount);

        int totalSum = Tree.sum(root);
        System.out.println("Sum of All Nodes: " + totalSum);

        int treeHeight = Tree.height(root);
        System.out.println("Height of the Tree: " + treeHeight);
    }
}
