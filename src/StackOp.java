public class StackOp{
    int[] Sarr = new int[10];
    int ptr;
    int val;

    public StackOp(){
        initializeStack();
    }
    public void initializeStack(){
         ptr = -1;
         val = 0;
    }
    public void insert(int element){
        if(ptr==Sarr.length-1){
            System.out.println("Overflow");
        }
        else{
            ptr++;
            Sarr[ptr] = element;
        }
    }
    public void delete(){
        if(ptr == -1){
            System.out.println("Underflow");
        }else{
            val = Sarr[ptr];
            ptr--;
        }
    }
    public void display(){
        for(int i = 0; i<=ptr; i++){
            System.out.print(Sarr[i] + " ");
        }
        System.out.println();
    }
    public static void main(){
        StackOp op = new StackOp();
        op.insert(5);
        op.insert(6);
        op.insert(2);
        op.insert(3);
        op.display();
        op.delete();
        op.display();
    }
}