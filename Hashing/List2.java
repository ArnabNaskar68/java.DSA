class List2{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node currNode=head;
            if(currNode.next!=null){
                currNode=currNode.next;
            }else{
                currNode.next=newNode;
            }
        }
    }
    void listPrint(){
        if(head==null){
            System.out.println("there is no linked list");
        }else{
            Node currNode=head;
            while(currNode!=null){
                System.out.println(currNode.data);
                currNode=currNode.next;
            }
        }
    }
    public static void main(String args[]){
        List2 l=new List2();
        l.addFirst(0);
        l.addLast(1);
        l.addLast(2);
        l.listPrint();
    }
}