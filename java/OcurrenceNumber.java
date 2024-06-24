import java.util.HashMap;
public class OcurrenceNumber {
    public static void main(String[] args){
        int[] arr = {10,5,10,15,10,5};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.print("{");
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey() + " : " + entry.getValue()+",");
        }
        System.out.println("}");
    }




















}
