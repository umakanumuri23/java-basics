public class CountNumbers {
    public static void main(String[] args){
        int n = 12345;
        String num = String.valueOf(n);
        int count = 0;
        for(int i = 0; i<num.length(); i++){
            count = count + 1;
        }
        System.out.println(count);
    }

}

