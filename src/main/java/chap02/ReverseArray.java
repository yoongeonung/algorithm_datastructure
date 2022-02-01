package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        // 요솟수를 받아서 배열을 생성후 역순으로 정렬하는 프로그램을 작성하시오
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요소수를 입력해 주세요 : ");
        int number = Integer.parseInt(br.readLine());
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("요소값을 입력해주세요 : ");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        reverse(numbers);

        for (int i : numbers) {
            System.out.println("i = " + i);
        }

    }

    private static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            swapArgs(numbers, i, numbers.length-1-i);
        }
    }

    private static void swapArgs(int[] numbers, int first, int last) {
        int temp = numbers[first];
        numbers[first] = numbers[last];
        numbers[last] = temp;
    }
}
