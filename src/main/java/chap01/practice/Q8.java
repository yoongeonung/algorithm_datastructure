package chap01.practice;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();
        // Gauss
        int result1 = n % 2 == 0 ? (1 + n) * n / 2 : (1 + n) * (n / 2) + ((n / 2) + (n % 2));
        int result2 = (1 + n) * (n / 2) + (n % 2 == 0 ? 0 : ((n / 2) + (n % 2)));

        System.out.println("result = " + result2);
    }
}
