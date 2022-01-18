package chap01.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        do {
            System.out.print("직각삼각형의 단수를 정해주세요 : ");
            number = Integer.parseInt(br.readLine());
        } while (number <= 0);
        triangleRB(number); // 오른쪽 아래가 직각
        triangleRU(number); // 오른쪽 위가 직각
        triangleLB(number); // 왼쪽 아래가 직각
        triangleLU(number); // 왼쪽 위가 직각

    }

    private static void triangleRB(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleRU(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ".repeat(i));
            for (int j = number - i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleLU(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleLB(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
