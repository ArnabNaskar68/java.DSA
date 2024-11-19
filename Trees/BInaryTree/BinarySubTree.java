//search && delete in BST
public class BinarySubTree {
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
static class Tree{

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

}
static void inorder(Node root){
    if(root!=null){
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
    }
}
static boolean search(Node root,int key){
    if(root==null) return false;
    if(key<root.data){
        return search(root.left,key);
    }else if(key>root.data){
        return search(root.right,key);
    }else{
        return true;
    }
}
static Node delete(Node root,int del){
    if(del<root.data){
        root.left=delete(root.left,del);
    }else if(del>root.data){
        root.right=delete(root.right,del);
    }else{
        // case 1 when the root has no nodes
        if(root.left==null && root.right==null){
            return null;
        }
        //case 2 when the root has either left or right node
        if(root.left==null){
            return root.right;
        }else if(root.right==null){
            return root.left;
        }
        //case 3 when the root has both left ND right nodes
            Node InorderSuccessor=successor(root.right);
            root.data=InorderSuccessor.data;
            root.right=delete(root.right,InorderSuccessor.data);
    }
    return root;
    
}
static Node successor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}


public static void main(String arg[]){
    int value[]={5,1,3,4,2,7};
    Node root=null;
    for(int i=0; i<value.length; i++){
        root=Tree.insert(root,value[i]);
    }
    inorder(root);
    // boolean check=search(root,1);
    // System.out.println(check);

    delete(root,5);
    System.out.println();
    inorder(root);
}
}
