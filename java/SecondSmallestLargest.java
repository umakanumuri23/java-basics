import java.util.Arrays;

public class SecondSmallestLargest {
     public static void main(String[] args){
         int [] arr = {1,2,5,7,7,4};
         findSmallestLargest(arr);
     }
     public static void findSmallestLargest(int[] arr){
         Arrays.sort(arr);
         int smallNum = -1;
         int larNum = -1;

         for(int i = 1;i<arr.length;i++){
             if(arr[0]<arr[i]){
                 smallNum = arr[i];
                 break;
             }
         }

         for(int i = arr.length-2;i>=0;i--){
             if(arr[arr.length-1] > arr[i]){
                 larNum = arr[i];
                 break;
             }
         }
         System.out.println(smallNum);
         System.out.println(larNum);



     }
}
