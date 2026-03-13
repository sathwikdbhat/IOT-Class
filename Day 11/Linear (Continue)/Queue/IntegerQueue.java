public class IntegerQueue {
    private static  final int MAX_SIZE=10;
    private int[] arr=new int[MAX_SIZE];
    private int front;
    private int rear;

    public IntegerQueue(){
        front=rear=-1;  // The queue is empty initially
    }

    public boolean isEmpty(){
        return (front==-1 && rear==-1);
    }

    public boolean isFull(){
        return rear==MAX_SIZE-1;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()){
            front=rear=0;
        }
        else {
            rear++;
        }
        // arr[0]=data
        // arr[5]=data
        arr[rear]=data;
        System.out.println("Enguired: "+data+" into the queue");
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        else if (front == rear){
            front=rear=1;
        }
        else {
            front++;
        }
    }

    public int getFront(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[rear];
    }
    
    public int getSize(){
        if (isEmpty()) return 0;
        return rear-front+1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for (int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IntegerQueue queue=new IntegerQueue();
        int[] arr={1,2,3,4,5};
        for (int x:arr)
            queue.enqueue(x);
    queue.display();
    queue.dequeue();
    queue.display();
    System.out.println(queue.getSize());
    System.out.println(queue.getFront());
    System.out.println(queue.getRear());
    }
}