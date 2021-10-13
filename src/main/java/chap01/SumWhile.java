package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다");
        System.out.print("n의 값을 입력해주세요 : ");
        int num = scanner.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= num) {
            sum += start;
            start++;
        }
        System.out.println("1부터" + num + "까지의 합은 = " + sum + " 입니다");
    }
}
