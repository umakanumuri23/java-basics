public class ReverseNumber {
    public static void main(String[] args){
        int N = 123;
        String str = String.valueOf(N);
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
