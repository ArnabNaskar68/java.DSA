class Linkedlist{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    static class list{
        static node head=null;
        static public boolean isEmpty(){
            return head==null;
         }
         static public void addFirst(int data){
            node newNode=new node(data);
            if(isEmpty()){
                head=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
         }
         static public void addLast(int data){
            node newNode=new node(data);
            if(isEmpty()){
                head=newNode;
            }else{
                node currNode=head;
                while(currNode.next!=null){
                    currNode=currNode.next;
                }
                currNode.next=newNode;
            }
         }
         static public void removeFirst(){
            if(isEmpty()){
                System.out.println("list is empty");
            }else{
                head=head.next;
            }
         }
         static public void removeLast(){
            if(isEmpty()){
                System.out.println("list is empty");
                return;
            }else{
                node lastNode=head.next;
                node secondLastNode=head;
                while(lastNode.next!=null){
                    lastNode=lastNode.next.next;
                    secondLastNode=secondLastNode.next;
            }
            secondLastNode.next=null;
         }
    }
    static public void printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        
        node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    
}
    public static void main(String arg[]){
        list ll=new list();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(2);
        ll.printList();
    }
}

