public class bubbleSortProgram{
    
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-2; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,2,6};
        System.out.println("Unsorted array");
        for(int num:arr){
            System.out.print(num + " ");
        }
        bubbleSortProgram op = new bubbleSortProgram();
        op.bubbleSort(arr);
        System.out.println("Sorted Array:");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}
