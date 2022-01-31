package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MaxOfArrayRand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        int[] heights = new int[people];
        for (int i = 0; i < people; i++) {
            Random rand = new Random();
            // nextInt(n) -> 0 ~ (n-1)
            int num = rand.nextInt(101) + 100;
            System.out.println("num = " + num);
            heights[i] = num;
        }

        System.out.println("최대값은 " + maxOf(heights) + "입니다.");
    }

    private static int maxOf(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
}
