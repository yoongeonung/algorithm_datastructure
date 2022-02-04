package chap02;

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

    public static void main(String[] args) {
        char[] chars = new char[32];
        int i = cardConvR(4, 2, chars);
        for (int j = chars.length - 1; j >= 0 ; j--) {
            System.out.print(chars[j]);
        }
    }
}
