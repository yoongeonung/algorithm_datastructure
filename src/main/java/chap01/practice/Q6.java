package chap01.practice;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력해주세요 : ");
        int n = scanner.nextInt();
        int starts = 1;
        int sum = 0;

        while (starts <= n) {
            System.out.println("starts = " + starts);
            sum += starts;
            starts++;
        }
        System.out.println("1부터" + n + "까지의 합은 = " + sum + " 입니다");
    }
}
