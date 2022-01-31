package chap02.practice;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int people = rand.nextInt(11) + 1;
        System.out.println("사람수는 " + people);
        int[] heights = new int[people];
        for (int i = 0; i < people; i++) {
            heights[i] = rand.nextInt(101) + 100;
            System.out.println("heights["+ i + "] = " + heights[i]);
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
