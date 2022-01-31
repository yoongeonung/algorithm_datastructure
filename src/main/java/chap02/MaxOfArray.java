package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfArray {

    private static int maxOf(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("사람 수를 입력해 주세요");
        int num = Integer.parseInt(br.readLine());
        int[] heights = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("키를 입력해주세요");
            int height = Integer.parseInt(br.readLine());
            heights[i] = height;
        }
        System.out.println("최대값은 " + maxOf(heights) + "입니다.");

    }
}
