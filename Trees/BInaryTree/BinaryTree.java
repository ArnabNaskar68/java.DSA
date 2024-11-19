//Depth-First Search & Breath-First Seacrh , height, node sum, total node count
//there is an error in the code syntax but the above operation logic implementation is correct
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {
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
        static int i=0;// to count no of nodes
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data);
            Tree.preorder(root.left);
            Tree.preorder(root.right);

        }
        public static void inorder(Node root){
            if(root==null) return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static int postorder(Node root){
            if(root==null) return 0;
            i++;//to count the no of nodes along with traversing
            postorder(root.left);
            postorder(root.right);
            System.out.println("node is="+" "+root.data);
            return i;
        }
        public static void level_order(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode!=null){
                    System.out.print(currNode.data);
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }else{
                    if(currNode==null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }
                }
            }
        }
        public static int count(Node root){//counts the total no of nodes
            if(root==null){
                return 0;
            }
            return 1+count(root.left)+count(root.right);//1 for root + total nodes in lrft + total in right
        }

        public static int height(Node root){
            if(root==null) return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }


        public static int sum(Node root){
            if(root==null) return 0;
            return root.data+sum(root.left)+sum(root.right);
        }
        public static Node binary_tree(int[] node) {
            ind++;
            if (ind > node.length-1 || node[ind] == -1) {
                return null;
            }
            Node new_node = new Node(node[ind]);
            new_node.left = binary_tree(node);
            new_node.right = binary_tree(node);
            return new_node;
        }
    }

        public static void main(String[] args) {

            int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6,-1,-1, 7,-1,-1};
            Node root = Tree.binary_tree(node);
            Tree.binary_tree(node);
            // System.out.println("Root of the tree: " + root.data);

            int b=Tree.postorder(root);//stores the total node and also travers using postorder;
            System.out.println(b);
            // Tree.level_order(root);
            // int a=Tree.count(root);
            // System.out.println(a);
            // int s=Tree.sum(root);
            // System.out.println(s);
            // int h=Tree.height(root);
            // System.out.println(h);

    }
}
