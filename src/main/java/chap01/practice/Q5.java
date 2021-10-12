package chap01.practice;

public class Q5 {
    static int median3(int a, int b, int c) {
        if ((b >= a && a >= c) || (a >= b && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        } else {
            return c;
        }
    }

/*
    Median.java에서는 최적의 경우 2번, 최악의 경우 4번의 비교를 하게 된다.
    하지만 Q5의 경우 최적의 경우 4번의 비교와 3번의 논리 연산을 해야 하며
    최악의 경우 8번의 비교와 6번의 논리 연산 후에 값을 도출하게 된다.

    Median.java은 깊이 우선탐색으로 한번 탐색시 차지하는 메모리가 적어 속도가 빠름에 비해
    해당 연산은 너비우선 탐색으로 한번에 메모리를 차지하는 데이터의 양이 많아 속도의 효율성이 떨어진다.
 */
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
