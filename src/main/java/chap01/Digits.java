package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두자리의 정수를 입력해주세요.");
        int num = 0;
        // 사후 판단 반복문
        do {
            System.out.print("입력 : ");
            num = Integer.parseInt(br.readLine());
        } while (num < 10 || num > 99);
    }
}
