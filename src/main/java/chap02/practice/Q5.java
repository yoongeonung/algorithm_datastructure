package chap02.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
    // 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요
    public static void main(String[] args) throws IOException {
        int[] a = createArray();
        int[] b = createArray();
        rcopy(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i] + ", <- " + "b[i] = " + b[i]);
        }
    }

    private static void rcopy(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = b.length - 1; i >= 0; i--) {
                a[(b.length - 1) - i] = b[i];
            }
        }
    }

    private static int[] createArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요솟수를 입력해 주세요 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = (int) (Math.random() * 9) + 1; // 1 <= x < 10
        }
        return numbers;
    }
}
