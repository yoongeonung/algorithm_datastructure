package chap01.practice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        System.out.print("a의 값 : ");
        a = scanner.nextInt();
        do {
            System.out.print("b의 값 : ");
            b = scanner.nextInt();
        } while (b <= a);
        System.out.println("b - a 는 " + ( b - a )+ " 입니다");
    }
}
