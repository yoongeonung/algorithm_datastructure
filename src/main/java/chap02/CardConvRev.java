package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardConvRev {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;						// 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);	// r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환후의 자릿수
        int retry; // 다시 한번?
        char[] chars = new char[32]; // 변환후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수변환 합니다.");
        do {
            do {
                System.out.println("변환하는 음이 아닌 정수 : ");
                no = Integer.parseInt(br.readLine());
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = Integer.parseInt(br.readLine());
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, chars);

            System.out.print(cd + "진수로는 ");
            for (int j = dno - 1; j >= 0; j--) {
                System.out.print(chars[j]);
            }
            System.out.println();

            System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
            retry = Integer.parseInt(br.readLine());
        } while (retry == 1);

    }
}
