import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] result = FindTwoSum(arr,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] FindTwoSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            int compliment = target-arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(arr[i],i);

        }
        return new int[] {-1,-1};
    }
}
