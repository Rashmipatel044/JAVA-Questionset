import java.util.HashMap;

public class Frequency {
    public static int maximumfrequency(int[] arr){
        HashMap<Integer,Integer>mp= new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

        }
        int maxFreq = 0;
        int maxElement = -1;
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }
       return maxElement;
    }
    public static void main(String[] args) {
  
int[]arr={1,3,1,3,1,1,76,43,65,76};
 System.out.println(maximumfrequency(arr)); 
        
    }
}
