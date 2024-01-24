class ArrayQueue{
   static class Queue{
        static int size;
        static int arr[];
        static int rear=-1;

        Queue(int size)
        {
            this.size=size;
            arr=new int[size];
        }

       public static boolean isEmpty(){
            return rear==-1;
        }

       public static void Enque(int data){
            if(rear==size-1){
                System.out.println("array is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("array is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }rear--;
            return front;

        }
        static int Peek(){
            if(isEmpty()){
                System.out.println("array is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String arg[]){
        Queue q=new Queue(5);
        q.Enque(1);
        q.Enque(2);
        q.Enque(3);

        while(!q.isEmpty()){
            System.out.println(q.Peek());
                q.Dequeue();
            }
        }
    
    }
