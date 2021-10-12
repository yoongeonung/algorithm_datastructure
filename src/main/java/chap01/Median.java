package chap01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (c >= a) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중간값을 구합니다.");
        System.out.print("a 의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b 의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c 의 값 : ");
        int c = scanner.nextInt();

        System.out.println("중간값은 " + med3(a,b,c)+ "입니다. ");
    }
}
