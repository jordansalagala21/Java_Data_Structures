import java.util.HashMap;
import java.util.Map;
public class ExampleHashMap{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,2,4,3,5,6};
        for(int i = 0; i<arr.length; i += 2){
            if(i + 1 < arr.length){
                map.put(arr[i], arr[i+1]);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            Integer key = entry.getKey();
            Integer Value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + Value);
        }
        
    }

 }
