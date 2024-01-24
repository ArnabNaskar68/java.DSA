public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        Queue(int size){
            this.size=size;
            arr=new int[size];
        }

        static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        static boolean isFull(){
            return front==(rear+1)%size;
        }

        static void Enque(int data){
            if(isFull()){
                System.out.println("array is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        static int Denque(){
            if(isEmpty()){
                System.out.println("array is empty");
                return -1;
            }
            
            int result =arr[front];
            if(front==rear){//single element condition
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("array is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String arg[]){
        Queue q=new Queue(5);
        q.Enque(1);
        q.Enque(2);
        q.Enque(3);
        q.Enque(4);
        q.Enque(5);
        q.Denque();
        q.Enque(6);
        q.Denque();
        q.Enque(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Denque();

        }


    }
}
