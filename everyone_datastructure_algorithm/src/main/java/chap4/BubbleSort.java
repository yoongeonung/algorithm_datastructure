package chap4;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{10, 5, 4, 3, 2, 1, 9, 8, 7, 6};
        int[] sortedArray = bubbleSortForInteger(testArray);
        System.out.println("sortedArray = " + Arrays.toString(sortedArray));
    }

    private static int[] bubbleSortForInteger(int[] array) {
        int unSortedUntilIndex = array.length - 1;
        boolean sorted = false;
        while (!sorted) {
            int temp = 0;
            // 어떤 교환도 하지 않고 전체 패스스루를 통과할때 sorted가 true로 남아서 정렬된것을 알 수 있다.
            // どんな交換もしてないままパーススルーを通過する時sortedがtrueになっていると整列されたと考えられる。
            sorted = true;
            for (int i = 0; i < unSortedUntilIndex; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
            unSortedUntilIndex -= 1;
        }
        return array;
    }
}
