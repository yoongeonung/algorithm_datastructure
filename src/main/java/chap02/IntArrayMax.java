package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntArrayMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("안원 수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());
        int[] peoples = new int[num];
        for (int i = 0; i < peoples.length; i++) {
            System.out.print(i + 1 + "번쨰 사람의 키를 입력 해주세요 : ");
            peoples[i] = Integer.parseInt(br.readLine());
        }
        int max = max(peoples);
        System.out.println("사람들 중에 제일 큰 키는 : " + max + "입니다");
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
