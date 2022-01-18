package chap01.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;

        do {
            System.out.print("원하는 피라미드의 단수를 입력해주세요 : ");
             num= Integer.parseInt(br.readLine());
        } while (num < 0);

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i-1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}