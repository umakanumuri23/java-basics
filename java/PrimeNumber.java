public class PrimeNumber {
    public static void main(String[] args) {
        int num = 23;
        if (num > 1) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("23 is a prime number");
            } else {
                System.out.println("23 is not a prime number");
            }
        } else {
            System.out.println("23 is not a prime number");
        }
    }
}
