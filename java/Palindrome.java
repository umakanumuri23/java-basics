public class Palindrome {
    public static void main(String[] args){
    int n = 123;
    String str = String.valueOf(n);
    String rev = "";
    for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
    }
    if(str == rev){
        System.out.println("it is palidrome");
    }
    else{
        System.out.println("it is not a palindrome");
    }





    }
}
