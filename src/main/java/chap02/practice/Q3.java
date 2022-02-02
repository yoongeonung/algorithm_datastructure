package chap02.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = (int) (Math.random() * 9) + 1;
        }
        System.out.println(sumOf(numbers));
    }

    private static int sumOf(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }
}
