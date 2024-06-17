import java.util.Scanner;
import java.util.Stack;


public class StackSorter {
    
    
    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()||stack.size()==1){
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertInSortedOrder(stack, top);
    }

    private static void insertInSortedOrder(Stack <Integer> stack, int element){
        
            if(stack.isEmpty()||stack.peek()<=element){
                stack.push(element);
                return;
            }
    
    int topItem = stack.pop();
    insertInSortedOrder(stack, element);
    stack.push(topItem);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("Select an option: 1 to Enqueue, 2 to Dequeue, 3 to Sort Stack, 4 to View Stack, 5 to Exit");
            int choice  = sc.nextInt();

            switch (choice) {
                case 1:
                 System.out.println("Enter an element to insert");
                 int n = sc.nextInt();
                 stack.push(n);
                 break;

                 case 2:
                 int top  = stack.pop();
                 System.out.println("Popped Element is:" + top);
                 break;

                 case 3:
                 System.out.println("Original Stack:" + stack);
                 sortStack(stack);
                 System.out.println("Sorted Stack:" + stack);
                 break;
                 
                 case 4:
                 System.out.println("Stack:" + stack);
                 break;
                

                 case 5:
                 continueLoop = false;
                 break;

                 default:
                 System.out.println("Invalid Choice, Please try again");
            }
        }
        sc.close();
    
    }

}
