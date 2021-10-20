package chap01.practice;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int length;
        do {
            System.out.print("양의 정수를 입력해 주세요 : ");
            number = scanner.nextInt();
            length = String.valueOf(number).length();
        } while (number <= length);
        System.out.println("그 수는 " + length + "자리입니다");
    }
}
