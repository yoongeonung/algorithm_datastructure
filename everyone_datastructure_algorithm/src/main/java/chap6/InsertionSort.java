package chap6;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = new int[]{4, 2, 7, 1, 3};
        int[] sortedArray = insertionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int position = i - 1;
            while (position >= 0) {
                if (array[position] > temp) {
                    array[position + 1] = array[position];
                    position = position - 1;
                } else {
                    break;
                }
            }

            array[position + 1] = temp;
        }
        return array;
    }
}
