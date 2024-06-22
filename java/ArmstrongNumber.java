

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        String str = String.valueOf(number);
        int lengthStr = str.length();
        int sum = 0;

        for (int i = 0; i < lengthStr; i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            sum = sum + (int) Math.pow(digit, lengthStr);
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
