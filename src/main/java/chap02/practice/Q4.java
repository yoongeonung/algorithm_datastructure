package chap02.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = createArray(br);
        int[] b = createArray(br);
        copy(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i] + ", " + "b[i] = " + b[i]);
        }
    }

    private static int[] createArray(BufferedReader br) throws IOException {
        System.out.print("요솟수를 입력해 주세요 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = (int) (Math.random() * 9) + 1;
        }
        return numbers;
    }

    private static void copy(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < b.length; i++) {
                a[i] = b[i];
            }
        }
    }
}
