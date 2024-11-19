// print exclusive range from the given node to the other given node && root to leaf node all possible paths
import java.util.ArrayList;
public class BSTRange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        public static Node create_BinaryTree(Node root,int val){//create a binary search tree withe the provided integer
            if(root==null){
                root=new Node(val);
            }else if(val<root.data){
                root.left=create_BinaryTree(root.left,val);
            }else{
                root.right=create_BinaryTree(root.right,val);
            }
            return root;
        }

        public static void inorder(Node root){//inorder traversal of Binary Search Tree
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void InRange(Node root,int x,int y){// printing the range of values present in the BST
            if(root==null) return;
            if(root.data>=x && root.data<=y){
                System.out.print(root.data+" ");
                InRange(root.left,x,y);
                // System.out.print(root.data+" ");
                InRange(root.right,x,y);
            }
            else if(root.data>=y){
                InRange(root.left,x,y);
            }else{
                InRange(root.right,x,y);
            }
        }
        static void read_list(ArrayList<Integer> list){//read the possible paths from the arraylist
            for(int i:list){
                System.out.print("-->"+i);
            }
            System.out.println();
        }
        public static void root_leaf(Node root,ArrayList<Integer> list){//create the arraylist to store
            if(root==null) {                                            //all possible leaf to root paths
                return;
            }
            list.add(root.data);
            if(root.left==null && root.right==null){
                read_list(list);
            }else{
            
            root_leaf(root.left,list);
            root_leaf(root.right,list);
            }
            list.remove(list.size()-1);
        }
        
    }
    public static void main(String arg[]){
        ArrayList<Integer> list=new ArrayList<>();
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0; i<values.length; i++){
            root=BinaryTree.create_BinaryTree(root,values[i]);
        }
        // BinaryTree.inorder(root);
        // BinaryTree.InRange(root,1,10);
        BinaryTree.root_leaf(root,list);
    }
}
