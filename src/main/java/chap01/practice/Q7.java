package chap01.practice;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 정수의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = scanner.nextInt();
        int sum = 0;
        StringBuilder str = new StringBuilder("");
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i == n) {
                str.append(i);
                str.append(" = ");
//                System.out.printf("%d ", i);
            } else {
                str.append(i);
                str.append(" + ");
//                System.out.printf("%d + ", i);
            }
        }
        System.out.println(str + "" + sum + "입니다.");
//        System.out.printf("= %d", sum);
    }
}
