package chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n; // 0 초기화
        int sum = 0;

        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n의 값 : ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 부터 " + n + "까지의 합은 " + sum + "입니다. ");
    }
}
