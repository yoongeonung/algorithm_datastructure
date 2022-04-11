package chap5;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 7, 1, 3};
        int[] ints = sortArrayWithSelectionSort(array);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] sortArrayWithSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int lowestNumberIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestNumberIndex]) {
                    lowestNumberIndex = j;
                }
            }

            if (lowestNumberIndex != i) {
                int temp = array[i];
                array[i] = array[lowestNumberIndex];
                array[lowestNumberIndex] = temp;
            }
        }
        return array;
    }
}
