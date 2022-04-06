package chap4;

import java.util.Arrays;

public class ON2 {
    public static void main(String[] args) {
        System.out.println(hasDuplicateValue(new int[]{1, 5, 4, 3, 6, 7, 9, 2, 10}));
        System.out.println(isInDuplicateValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 25}));
    }

    // O(N^2) 알고리즘
    private static boolean hasDuplicateValue(int[] array) {
        // 이중 루프를 보는 순간 O(N^2) 냄세가 나야한다.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(N^2) -> O(N) 자바로 억지로 구현
    private static boolean isInDuplicateValue(int[] array) {
        int maxStep = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            maxStep++;
        }

        int duplicateSteps = 0;
        int[] existingNumbers = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            duplicateSteps++;
            if (existingNumbers[array[i]] == 1) {
                return true;
            } else {
                existingNumbers[array[i]] = 1;
            }
        }

        System.out.println("maxStep = " + maxStep);
        System.out.println("duplicateSteps = " + duplicateSteps);
        return false;
    }


}
