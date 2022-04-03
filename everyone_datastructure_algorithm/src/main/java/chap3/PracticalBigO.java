package chap3;

public class PracticalBigO {
    public static void main(String[] args) {
        // O(N)
        String[] things = new String[]{"apples", "baboons", "cribs", "dulcimers"};
        for (String thing: things) {
            System.out.printf("Here's a thing: %s \n", thing);
        }

        // O(N)
        boolean result = isPrime(7);
        System.out.printf("Is %d prime number ? : %b \n", 7,result );

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
