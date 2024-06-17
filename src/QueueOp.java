public class QueueOp{
    int[] Qarr = new int[10];
    int front;
    int rear;
    int val;
    public QueueOp(){
        initializeQueue();
    }
    public void initializeQueue(){
        front = 0;
        rear = -1;
        val = 0;
    }
    public void Enqueue(int element){
        if(rear==Qarr.length-1){
            System.out.println("Overflow");
        }else{
            rear++;
            Qarr[rear] = element;
        }
    }
    public void Dequeue(){
        if(front>rear||rear==-1){
            System.out.println("Underflow");
        }else
        {
            val = Qarr[front];
            front++;
            if(front>rear){
                initializeQueue();
            }
        }
    }
}