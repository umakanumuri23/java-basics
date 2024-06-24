import java.util.HashMap;

public class MinMaxFreq {
    public static void main(String[] args){
        int[] arr = {10,5,10,15,10,5};
        int maxEl = 0;
        int minEl = 0;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();


            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxEl = element;

            }

            if (frequency < minFreq) {
                minFreq = frequency;
                minEl = element;
            }
        }
        System.out.println(maxEl);
        System.out.println(minEl);








    }
}
