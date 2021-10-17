package chap01.practice;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();
        int s = 1;
        int quotient = n / 2;
        int rest = n % 2;
        int some = quotient + rest;
        // Gauss
        int result = (s + n) * quotient + some;
        System.out.println("result = " + result);
    }
}
