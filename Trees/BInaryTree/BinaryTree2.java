//Diameter of a Binary Tree
public class BinaryTree2 {
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

        static Node binary_tree(int node[]) {
            ind++;
            if (ind >= node.length || node[ind] == -1) return null;

            Node new_node = new Node(node[ind]);
            new_node.left = binary_tree(node);
            new_node.right = binary_tree(node);

            return new_node;
        }
    }

    static class Height {
        int height;
        int diameter;

        Height(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }

        static Height Tree_info(Node root) {
            if (root == null) {
                return new Height(0, 0); // Fixed return statement
            }

            // Recursively find height and diameter of left and right subtrees
            Height left = Tree_info(root.left);
            Height right = Tree_info(root.right);

            // Height of current node
            int Myheight = 1 + Math.max(left.height, right.height);

            // Diameter for paths that pass through this node
            int along_root = left.height + right.height + 1;

            // Maximum diameter
            int Mydiam = Math.max(along_root, Math.max(left.diameter, right.diameter));

            // Returning combined height and diameter info for current node
            return new Height(Myheight, Mydiam);
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = Tree.binary_tree(node);

        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println();

        // Calculate diameter
        Height result = Height.Tree_info(root);
        System.out.println("Diameter of the binary tree is: " + result.diameter);
    }
}
