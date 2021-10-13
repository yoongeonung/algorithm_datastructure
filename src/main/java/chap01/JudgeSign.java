package chap01;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = scanner.nextInt();
//        보통의 3분기
//        if (a > 0) {
//            System.out.println("양수입니다.");
//        } else if (a < 0) {
//            System.out.println("음수입니다.");
//        } else {
//            System.out.println("0입니다");
//        }
        if (a == 1) {
            System.out.println("양수입니다.");
        } else if (a == 2) {
            System.out.println("음수입니다.");
        } else { // else if (a == 3) 에서 if()부분을 생략 가능
            System.out.println("0입니다");
        }
    }
}
