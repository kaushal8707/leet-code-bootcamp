
public class Queue1 {
    int front;
    int rear;
    int size;
    int arr[]=new int[4];

    Queue1(){
        front=0;
        rear=-1;
        size=0;
    }

    public void enqueue(int data) {

        rear++;
        arr[rear]=data;
        size++;
    }

    public int dequeue() {
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public int peek() {
        int data = arr[front];
        return data;
    }

    public void printQueue() {
        for(int i=front; i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Queue1 queue=new Queue1();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(43);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();

        int deQueueElement =queue.dequeue();
        System.out.print("\nDequeue Element - "+deQueueElement);

        int deQueueEle =queue.dequeue();
        System.out.print("\nDequeue Element - "+deQueueEle);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();

        int peekedElement =queue.peek();
        System.out.print("\n Peek Element - "+peekedElement);

        System.out.println("\nAvailable in Queue");
        queue.printQueue();
    }
}
