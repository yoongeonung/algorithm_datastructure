package chap01.practice;

public class Q4 {
    static int median3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("median3(3,2,1) = " + median3(3,2,1)); // A
        System.out.println("median3(3,2,2) = " + median3(3,2,2)); // B
        System.out.println("median3(3,1,2) = " + median3(3,1,2)); // C
        System.out.println("median3(3,2,3) = " + median3(3,2,3)); // D
        System.out.println("median3(2,1,3) = " + median3(2,1,3)); // E
        System.out.println("median3(3,3,2) = " + median3(3,3,2)); // F
        System.out.println("median3(3,3,3) = " + median3(3,3,3)); // G
        System.out.println("median3(2,2,3) = " + median3(2,2,3)); // H
        System.out.println("median3(2,3,1) = " + median3(2,3,1)); // I
        System.out.println("median3(2,3,2) = " + median3(2,3,2)); // J
        System.out.println("median3(1,3,2) = " + median3(1,3,2)); // K
        System.out.println("median3(2,3,3) = " + median3(2,3,3)); // L
        System.out.println("median3(1,2,3) = " + median3(1,2,3)); // M
    }
}
