package chap01.practice;

public class Q9 {
    public static void main(String[] args) {
        int result = sumof(3,6);
        int result2 = sumof(6, 4);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }

    static int sumof(int a, int b) {
        int sum = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
