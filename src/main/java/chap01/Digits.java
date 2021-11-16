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
        } while (!(num >= 10 && num <= 99));

        // num < 10 || num > 99 드모르간 법칙 적용 전
        // !(num >= 10 && num <= 99) 드모르간 법칙 적용
        /*
         * 드모르간의 법칙
         * 각 조건을 부정하고, 논리합(||)을 논리곱(&&)으로
         * 또는 논리곱을, 논리합으로 바꾸고 다시 전체를 부정하면
         * 원래의 조건과 같다는 법칙
         */
    }
}
