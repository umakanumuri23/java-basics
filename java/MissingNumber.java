

public class MissingNumber {
    public static void main(String[] args){
        int n = 5;
        int[] arr = {1,2,4,5};
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<arr.length;i++){
            sum1 = sum1 +arr[i];
        }
        for(int i = 1;i<=n;i++){
            sum2 = sum2 + i;
        }
        System.out.println("missing num is : "+(sum2-sum1));
    }

}
