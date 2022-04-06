package chap4;

public class ON2 {
    public static void main(String[] args) {
        System.out.println(hasDuplicateValue(new int[]{1, 5, 4, 3, 6, 7, 9, 10, 10}));
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


}
