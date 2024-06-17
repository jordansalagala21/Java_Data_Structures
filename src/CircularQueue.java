public class CircularQueue {
    private int Qarr[] = new int[5];
    private int front;
    private int rear;
    private int trash;


    public CircularQueue(){
        initializeCircularQueue();
    }
    public void initializeCircularQueue(){
         front = -1;
         rear = -1;
         trash = 0;
    }
    public void Enqueue(int element){
        if(front == 0  && rear == Qarr.length-1 || front == rear+1){
            System.out.println("Queue Overflow");  
    }else
        if(front == -1 && rear ==-1){
            front = 0;
            rear = 0;
        }else
        if (rear == Qarr.length-1) {
            rear = 0;
        }else
        rear++;
        Qarr[rear] = element;
    }
    public void Dequeue(){
        if (front == -1 && rear ==-1) {
            System.out.println("Queue Underflows");
        }
        else
        trash = Qarr[front];
        if(front==Qarr.length-1){
            front=0;
        }
        else if(front==rear){
            front = -1;
            rear = -1;
        }
        else 
        {
            front = front+1;
        }
    }
    public void display(){
        for(int i = front; i <= rear; i++)
        { 
            System.out.print(Qarr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue op = new CircularQueue();
        op.Enqueue(10);
        op.Enqueue(20);
        op.Enqueue(30);
        op.Enqueue(30);
        op.Enqueue(30);
       op.display();
       op.Dequeue();
       op.display();
    }
}
