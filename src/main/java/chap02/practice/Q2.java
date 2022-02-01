package chap02.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요소수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("숫자를 입력해주세요 : ");
            nums[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        reverse(nums);
    }

    private static void reverse(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            swapArgs(nums, i, nums.length - 1 - i);
            System.out.println();
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    private static void swapArgs(int[] nums, int first, int last) {
        System.out.print("a[" + first + "]와 a[" + last + "]를 교환합니다." + "\n");
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}
