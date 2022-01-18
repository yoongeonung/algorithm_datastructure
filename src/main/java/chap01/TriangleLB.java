package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleLB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        do {
            System.out.print("직각삼각형의 단수를 정해주세요 : ");
            number = Integer.parseInt(br.readLine());
        } while (number <= 0);

        triangleLB(number);
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
