class List{
    Node head=null;
    class Node{
        String data;
        Node next;
        
          Node(String data){
            this.data=data;
            this.next=null;
        }
    }
      void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
       
    }
    void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    }
     void printList(){
         Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void main(String args[]){
        List ll=new List();
        ll.addFirst("you");
        ll.addFirst("love");
        ll.addFirst("i");
        ll.addLast("bumbum");
        ll.printList();
    }
}