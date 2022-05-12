package chap10;

import java.util.Arrays;

public class DoubleArray {

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 4, 5};
    doubleArray(a, 0);
    System.out.println(Arrays.toString(a));
  }

  private static void doubleArray(int[] array, int index) {
    if (index >= array.length) {
      return;
    }
    array[index] *= 2;
    doubleArray(array, index + 1);
  }

}
