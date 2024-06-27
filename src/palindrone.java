import java.util.Scanner;


public class palindrone {
    	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i = 1; i<=n-1; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
		  //wite code here